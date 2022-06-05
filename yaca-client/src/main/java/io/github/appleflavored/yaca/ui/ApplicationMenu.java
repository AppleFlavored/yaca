package io.github.appleflavored.yaca.ui;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;

public class ApplicationMenu extends MenuBar {

    private Menu chatMenu;
    private Menu userMenu;

    public ApplicationMenu() {
        chatMenu = new Menu("Chat");
        userMenu = new Menu("User");
        getMenus().addAll(chatMenu, userMenu);
    }
}
