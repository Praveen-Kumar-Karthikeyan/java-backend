package com.practical.java8.features.app.capegemini;

public class RaceCondition {


    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable runnable = () -> {
            for (int i = 0; i < 10000; i++)
                counter.incrementCount();
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.setName("Thread One-");
        thread2.setName("Thread Two-");
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
//        Thread.currentThread().join();

        System.out.println("Final count: " + counter.getCount());
    }
}
