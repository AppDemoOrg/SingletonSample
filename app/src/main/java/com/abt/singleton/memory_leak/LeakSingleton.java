package com.abt.singleton.memory_leak;

import android.content.Context;

/**
 * @描述： @LeakSingleton
 * @作者： @黄卫旗
 * @创建时间： @22/06/2018
 */
public class LeakSingleton {

    private Context mContext;

    private static LeakSingleton sInstance;

    private LeakSingleton(Context context) {
        mContext = context;
    }

    public static LeakSingleton getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new LeakSingleton(context);
        }
        return sInstance;
    }
}
