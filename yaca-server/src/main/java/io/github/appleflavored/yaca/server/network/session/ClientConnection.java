package io.github.appleflavored.yaca.server.network.session;

import io.netty.channel.Channel;

public class ClientConnection {

    private final Channel channel;
    private ClientState state;

    public ClientConnection(Channel channel) {
        this.channel = channel;
        this.state = ClientState.HANDSHAKE;
    }

    public void sendPacket() {
        
    }

    public void sendPackets() {

    }

    public void disconnect() {
        // TODO: Send disconnect packet.
        channel.disconnect();
    }
}
