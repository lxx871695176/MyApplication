package com.liuxixin.utils;

import android.util.Log;

public class CommUtils {
    private static final String TAG = CommUtils.class.getSimpleName();

    private static String sData = "";

    public static void printLog(String str){
        Log.i(TAG, "printLog() str=" + str);
    }

    public static void setData(String data){
        sData = data;
    }

    public static String getData(){
        return sData;
    }

}