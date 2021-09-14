package com.example.threadday1you;

import android.os.Handler;
import android.os.Looper;

public class WorkerThread extends Thread {
    private Handler handler;

    @Override
    public void run() {
        super.run();
        Looper.prepare();
        handler = new Handler();
        Looper.loop();
    }
    public void addTaskToMessageQueue(Runnable task){
        if (handler!=null){
            handler.post(task);
        }
    }
}
