package com.chanjay.smartpeking.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * sharepreference工具类
 */
public class PrefUtil {

    private static final String PREF_NAME = "config";

    public static boolean getBoolean(Context ctx,String key,boolean defaultValue){
        SharedPreferences sp = ctx.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return sp.getBoolean(key,defaultValue) ;
    }

    public static void setBoolean(Context ctx,String key,boolean value){
        SharedPreferences sp = ctx.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        sp.edit().putBoolean(key,value).commit();
    }

}
