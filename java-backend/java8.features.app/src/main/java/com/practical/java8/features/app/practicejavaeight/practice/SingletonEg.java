package com.practical.java8.features.app.practicejavaeight.practice;

public class SingletonEg {

    private static SingletonEg singletonObj;

    private SingletonEg() {
    }

    protected static SingletonEg returnSingleObject() {
        if (singletonObj == null) {
            singletonObj = new SingletonEg();
            return singletonObj;
        } else
            return singletonObj;
    }
}
