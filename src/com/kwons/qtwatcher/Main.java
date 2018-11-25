package com.kwons.qtwatcher;

import com.kwons.qtwatcher.debug.Debug;
import com.kwons.qtwatcher.debug.log.Log;
import com.kwons.qtwatcher.view.UserInterfaceFrame;

public class Main {
    public static void main(String args[])
    {
        if (Debug.isDebug) Log.msg("MAIN", "Java Application has been launched!");
        UserInterfaceFrame uiFrame = new UserInterfaceFrame();
    }
}
