package com.kwons.qtwatcher.view;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UserInterfaceStage extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 500);

        primaryStage.setTitle("Quantity Watcher");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}