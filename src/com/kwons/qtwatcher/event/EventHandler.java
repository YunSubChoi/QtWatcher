package com.kwons.qtwatcher.event;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class EventHandler {
    private String TAG = "EventHandler";

    private static EventHandler mInstance;
    private static Object instanceLock;

    private Queue<Event> eventQ;

    private EventHandler () {

    }

    /**
     * This pattern is for avoiding try to lock whenever
     * getInstance() is called.
     * */
    public static EventHandler getInstance() {
        if (mInstance == null) {
            synchronized (instanceLock) {
                if (mInstance == null) {
                    mInstance = new EventHandler();
                }
            }
        }
        return mInstance;
    }


}
