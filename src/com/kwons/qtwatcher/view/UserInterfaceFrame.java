package com.kwons.qtwatcher.view;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.kwons.qtwatcher.Config;
import com.kwons.qtwatcher.debug.Debug;
import com.kwons.qtwatcher.debug.log.Log;


public class UserInterfaceFrame extends JFrame implements ActionListener{
	private static final String TAG = "UserInterfaceFrame";
	
	private ShoppingMallList shoppingMallList = new ShoppingMallList();
	private TargetUrlField urlField = new TargetUrlField();
	private RefreshPeriodValueField refreshPeriodValueField = new RefreshPeriodValueField();
	private MailAddressField mailAddressField = new MailAddressField();
	private LauncherButton launcherButton = new LauncherButton();
	
	public UserInterfaceFrame () {
		super("Qantity Watcher v0.1 ");
		setBounds(200, 200, 300, 300);		
		setLayout(new GridLayout(3, 1, 0, 4)); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawComponents();
	}
	
	private void startPollingWithParams() {
		if (Debug.isDebug) {
			Log.msg(TAG, "Start polling with following params");
			Log.msg(TAG, "Selected shopping mall: " + shoppingMallList.getSelectedItem());
			Log.msg(TAG, "Full URL: " + urlField.getText());
			Log.msg(TAG, "Refresh Period: " + refreshPeriodValueField.getText());
			Log.msg(TAG, "Target mail address: " + mailAddressField.getText());
		}
	}
	
	private void drawComponents() {
		Container container = getContentPane();
		
		// Shopping mall list area
		container.add(shoppingMallList);
		
		// Panel for Input parameters
		Panel inputParamPanel = new Panel();
		inputParamPanel.setLayout(new GridLayout(3, 2, 0, 2));
	
		// Input parameter fields
		Label urlLabel = new Label("Full URL :");
		inputParamPanel.add(urlLabel);
		inputParamPanel.add(urlField);
		
		Label refreshPeriodLabel = new Label("Refresh Period(in sec) :");
        inputParamPanel.add(refreshPeriodLabel);
        inputParamPanel.add(refreshPeriodValueField);
 
        Label mailAddressLabel = new Label("Your mail address :");
        inputParamPanel.add(mailAddressLabel);
        inputParamPanel.add(mailAddressField);
        container.add(inputParamPanel);
        
        // Launcher and stop button;
        launcherButton.addActionListener(this);
        container.add(launcherButton);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		startPollingWithParams();
	}
	
}