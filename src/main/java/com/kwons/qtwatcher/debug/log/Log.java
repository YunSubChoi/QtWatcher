package com.kwons.qtwatcher.debug.log;

public final class Log {
    private static final int ERR = 0;
    private static final int WRN = 1;
    private static final int MSG = 2;
    private static final int DBG = 3;

    public static void error (String tag, String log) {
        print(tag, log, ERR);
    }

    public static void warning (String tag, String log) {
        print(tag, log, WRN);
    }

    public static void msg (String tag, String log) {
        print(tag, log, MSG);
    }

    public static void dbg (String tag, String log) {
        print(tag, log, DBG);
    }

    private synchronized static void print(String tag, String log, int level) {
        System.out.println(getThreadIdString(Thread.currentThread().getId())
                + levelToSymbol(level) + "|" + tag + "|" + log);
    }

    private static String levelToSymbol(int level) {
        switch (level) {
            case ERR:
                return "!";
            case WRN:
                return "#";
            case MSG:
                return "@";
            case DBG:
                return "$";
            default:
                return null;
        }
    }

    private static String getThreadIdString(Long tid) {
        return String.format("0x%08X", tid);
    }
}
