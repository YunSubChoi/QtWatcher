package com.kwons.qtwatcher.view;

import java.awt.List;

import com.kwons.qtwatcher.ShoppingMallInfos;
import com.kwons.qtwatcher.debug.Debug;
import com.kwons.qtwatcher.debug.log.Log;

public class ShoppingMallList extends List {
	private static final String TAG = "ShopppingMallList";
		
	public ShoppingMallList() {
		if (Debug.isDebug) {
			Log.msg(TAG, "Initialize Shopping mall list");
		}
		ShoppingMallInfos infos = ShoppingMallInfos.getInstance();
		for (ShoppingMallInfos.ShoppingMallInfo info : infos.list) {
			add(info.name);
		}
	}
}
