package com.ericsson;

public class Task implements Runnable{

    private String text;

    public Task(String text) {
       this.text = text;
    }

    @Override public void run() {
        System.out.println(text);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
