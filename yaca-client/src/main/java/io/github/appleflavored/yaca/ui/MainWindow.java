package io.github.appleflavored.yaca.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainWindow extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();

        ApplicationMenu menu = new ApplicationMenu();
        root.setTop(menu);

        stage.setScene(new Scene(root, 900, 600));
        stage.show();
    }
}
