package com.practical.java8.features.app.capegemini;

public class Counter {

    private int counterVar;

    synchronized void incrementCount() {
        counterVar++;
    }

    int getCount() {
        return counterVar;
    }
}
