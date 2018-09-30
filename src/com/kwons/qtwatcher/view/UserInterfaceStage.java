package com.kwons.qtwatcher.view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class UserInterfaceStage extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        pane.setMinSize(250,400);
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setVgap(5);
        pane.setHgap(5);

        ShoppingMallList shoppingMallList = new ShoppingMallList();
        TargetUrlField urlField = new TargetUrlField();
        RefreshPeriodValueField refreshPeriodValueField = new RefreshPeriodValueField();
        MailAddressField mailAddressField = new MailAddressField();
        LauncherButton launcherButton = new LauncherButton();
        StopButton stopButton = new StopButton();

        pane.add(shoppingMallList, 0, 0);
        pane.add(urlField, 0, 1);
        pane.add(refreshPeriodValueField, 0, 2);
        pane.add(mailAddressField, 0, 3);
        pane.add(launcherButton, 0, 4);
        pane.add(stopButton, 0, 5);

        Scene scene = new Scene(pane);

        primaryStage.setTitle("Quantity Watcher");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}