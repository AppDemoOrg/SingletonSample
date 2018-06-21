package com.abt.singleton.memory_leak;

import android.content.Context;

/**
 * @描述： @UnLeakSingleton
 * @作者： @黄卫旗
 * @创建时间： @22/06/2018
 */
public class UnLeakSingleton {

    private Context mContext;

    private static UnLeakSingleton sInstance;

    private UnLeakSingleton(Context context) {
        mContext = context;
    }

    public static UnLeakSingleton getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new UnLeakSingleton(context.getApplicationContext());
        }//这一句是关键
        return sInstance;
    }
}
