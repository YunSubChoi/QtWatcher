package com.kwons.qtwatcher;

import com.kwons.qtwatcher.debug.Debug;
import com.kwons.qtwatcher.debug.log.Log;
import com.kwons.qtwatcher.view.UserInterfaceStage;

public class Main {
    public static void main(String args[])
    {
        if (Debug.isDebug) Log.msg("MAIN", "JavaFX Application has been launched!");
       
    }
}
