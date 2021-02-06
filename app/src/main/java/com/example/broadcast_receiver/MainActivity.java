package com.example.broadcast_receiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private myBroadcast nmBroadcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nmBroadcast = new myBroadcast();

    }

    @Override
    protected void onStart() {
        super.onStart();

        IntentFilter filter = new IntentFilter("android.example.sendBroadCast");
        registerReceiver(nmBroadcast , filter);
    }

    @Override
    protected void onStop() {
        super.onStop();

        unregisterReceiver(nmBroadcast);
    }
}
