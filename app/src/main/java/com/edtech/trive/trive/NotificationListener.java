package com.edtech.trive.trive;

import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.gcm.GcmListenerService;

/**
 * Created by sondremare on 05.02.2016.
 */
public class NotificationListener extends GcmListenerService {
    private static final String TAG = "NotificationListener";

    @Override
    public void onMessageReceived(String from, Bundle data) {
        String message = data.getString("message");
        Log.d(TAG, "From: " + from);
        Log.d(TAG, "Message: " + message);
    }
}
