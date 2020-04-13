package com.example.mapingwithinterction;

import android.app.Application;

import com.mapbox.mapboxsdk.Mapbox;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Mapbox access token is configured here. This needs to be called either in your application
        // object or in the same activity which contains the mapview.
        Mapbox.getInstance(this, getString(R.string.access_token));
    }
}
