package com.techtitan.yesdriver.util;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;

public class NetworkCheck {
    //*********** Checks if the Device is Connected to any Network ********//

    public static boolean isNetworkAvailable(Activity activity) {

        ConnectivityManager connectivity = (ConnectivityManager) activity.getSystemService(Context.CONNECTIVITY_SERVICE);

        Network[] networks = connectivity.getAllNetworks();
        NetworkInfo networkInfo;

        for (Network mNetwork : networks) {

            networkInfo = connectivity.getNetworkInfo(mNetwork);

            if (networkInfo.getState().equals(NetworkInfo.State.CONNECTED)) {
                return true;
            }
        }

        return false;
    }

}
