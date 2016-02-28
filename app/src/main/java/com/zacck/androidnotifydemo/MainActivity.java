package com.zacck.androidnotifydemo;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent notiftIntent = new Intent(getApplicationContext(), MainActivity.class);
        //Pending Intent
        PendingIntent mPender = PendingIntent.getActivity(getApplicationContext(), 1, notiftIntent, 0);



        //creating the notification and its content
        Notification mNotify = new  Notification.Builder(getApplicationContext())
                .setContentTitle("Android Is Awesome")
                .setContentText("You Wouldn't Belive How much simpler this is")
                .setSmallIcon(android.support.v7.appcompat.R.drawable.abc_ic_menu_copy_material)
                .setContentIntent(mPender)
                .addAction(android.R.drawable.ic_lock_idle_alarm, "Dev", mPender)
                .build();

        //Showing the user the notification
        NotificationManager mNotManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        mNotManager.notify(1, mNotify);





    }
}
