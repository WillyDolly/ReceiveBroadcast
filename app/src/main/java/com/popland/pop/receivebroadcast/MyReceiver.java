package com.popland.pop.receivebroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        String mess = intent.getStringExtra("mess");
        MainActivity.receiveCommand(mess);
        Toast.makeText(context,"received",Toast.LENGTH_SHORT).show();
    }
}
