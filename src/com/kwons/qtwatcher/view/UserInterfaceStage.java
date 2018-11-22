package com.kwons.qtwatcher.view;

import java.awt.Panel;

public class UserInterfaceStage {

    
    public void draw() {
        Panel panel = new Panel();
        panel.setSize(250,400);
        
        ShoppingMallList shoppingMallList = new ShoppingMallList();
        TargetUrlField urlField = new TargetUrlField();
        RefreshPeriodValueField refreshPeriodValueField = new RefreshPeriodValueField();
        MailAddressField mailAddressField = new MailAddressField();
        LauncherButton launcherButton = new LauncherButton();
        StopButton stopButton = new StopButton();

        panel.add(shoppingMallList, 0, 0);
        panel.add(urlField, 0, 1);
        panel.add(refreshPeriodValueField, 0, 2);
        panel.add(mailAddressField, 0, 3);
        panel.add(launcherButton, 0, 4);
        panel.add(stopButton, 0, 5);

    }

}