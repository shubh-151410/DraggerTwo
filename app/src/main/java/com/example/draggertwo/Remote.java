package com.example.draggertwo;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Remote";

    @Inject
    public Remote() {
    }

    public void listener(Car car){
        Log.d(TAG, "listener....");
    }
}
