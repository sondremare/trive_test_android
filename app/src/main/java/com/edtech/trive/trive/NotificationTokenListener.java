package com.edtech.trive.trive;

import android.content.Intent;

import com.google.android.gms.iid.InstanceIDListenerService;

/**
 * Created by sondremare on 05.02.2016.
 */
public class NotificationTokenListener extends InstanceIDListenerService {
    private static final String TAG = "NotificationTokenListener";

    @Override
    public void onTokenRefresh() {
        // Fetch updated Instance ID token and notify our app's server of any changes (if applicable).
        Intent intent = new Intent(this, NotificationRegistration.class);
        startService(intent);
    }
}
