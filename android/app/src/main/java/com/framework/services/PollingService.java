/**
 * @FileName PollingService.java
 */
package com.framework.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.framework.pages.activity.MessageActivity;
import com.framework.utilities.NotificationUtility;
import com.minimalisticnativecljs.R;

/**
 * Class Name: PollingService.java
 *
 * Function:
 *
 * Modifications:
 *
 * @author MeePwn
 * @version 1.0
 */
public class PollingService extends Service {

    public static final String ACTION = "com.framework.services.PollingService";

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // new PollingThread().start();
        showNotification();
        return super.onStartCommand(intent, flags, startId);
    }

    private void showNotification() {
        NotificationUtility.showNotification(R.mipmap.ic_launcher, "title", "message", MessageActivity.class);
    }

    /**
     * Polling thread 模拟像Service轮询的异步线程
     *
     * @Author MeePwn
     */
    int count = 0;

    class PollingThread extends Thread {
        @Override
        public void run() {
            System.out.println("Polling...");
            count++;
            // 当计数能被5整除时, 弹出通知
            if (count % 5 == 0) {
                showNotification();
                System.out.println("New message!");
            }
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("Service:onDestroy");
    }

}