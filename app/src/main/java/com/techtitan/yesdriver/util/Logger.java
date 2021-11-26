package com.techtitan.yesdriver.util;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class Logger {
    private static String TAG="checkyesproject  ==>";

    public static void w(String message){
        Log.w(TAG,message);
    }
    public static void i(String message){
        Log.i(TAG,message);
    }
    public static void d(String message){
        Log.d(TAG,message);
    }

    public static void e(String message){
        Log.e(TAG,message);
    }
    public static void v(String message){
        Log.v(TAG,message);
    }

    public static void toastwarn(Context context,String message){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }
    public static void toastinfo(Context context,String message){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }
    public static void toasterror(Context context,String message){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }
    public static void toastsuccess(Context context,String message){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }
}
