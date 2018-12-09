package com.kwons.qtwatcher;

import java.util.ArrayList;


public class ShoppingMallInfos {
	private static ShoppingMallInfos instance;
	public ArrayList<ShoppingMallInfo> list;
	private static Object lock = new Object();
	
	public ShoppingMallInfos() {
		list = new ArrayList<ShoppingMallInfo>();
		list.add(new ShoppingMallInfo("amazon.com", "soldout", "on sail"));
		list.add(new ShoppingMallInfo("ebay.com", "soldout", "on sail"));
		list.add(new ShoppingMallInfo("11st.com", "soldout", "on sail"));
	}
	
	public class ShoppingMallInfo {
		public String name;
		public String soldoutKwd;
		public String onSailKwd;
		public ShoppingMallInfo (String name, String soldoutKwd,
				String onSailKwd) {
			this.name = name;
			this.soldoutKwd = soldoutKwd;
			this.onSailKwd = onSailKwd;
		}
	}
	
	public static ShoppingMallInfos getInstance() {
		if (instance == null) {
			synchronized (lock) {
				if (instance == null) {
					instance = new ShoppingMallInfos();
				}
			}
		}
		return instance;
	}
	
}
