package com.ericsson;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class Consumer implements Runnable{
    private LinkedBlockingDeque<Runnable> queue;
    private ExecutorService executor = Executors.newSingleThreadExecutor();

    public Consumer(LinkedBlockingDeque<Runnable> queue) {
        this.queue = queue;
    }

    @Override public void run() {
        try {
            while(true) {
                executor.execute(queue.takeFirst());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
