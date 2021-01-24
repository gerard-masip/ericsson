package com.ericsson;

import java.util.concurrent.LinkedBlockingDeque;

public class Executor {


    public static void main(String[] args) throws InterruptedException {
         LinkedBlockingDeque<Runnable> queue = new LinkedBlockingDeque<>();

        Consumer consumer = new Consumer(queue);

        new Thread(consumer).start();

        queue.put(new Task("first"));
        queue.put(new Task("second"));
        queue.put(new Task("third"));

        Thread.sleep(5000);

        queue.put(new Task("fourth"));

    }

}
