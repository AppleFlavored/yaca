package io.github.appleflavored.yaca.server.network;

import io.github.appleflavored.yaca.server.network.session.ClientConnection;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class PacketInboundHandler extends SimpleChannelInboundHandler<ByteBuf> {

    private ClientConnection connection;

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        connection = new ClientConnection(ctx.channel());
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {
        int length = msg.readUnsignedShort();
        int id = msg.readUnsignedShort();

        switch (id) {
            case 0x00 -> {
                connection.disconnect();
            }
            default -> {
                ctx.disconnect();
                throw new RuntimeException("Unhandled packet: " + id);
            }
        }
    }
}
