package com.practical.java8.features.app.capegemini;

public class Printer<T> {

    private T printTheType;

    public Printer(T printTheType) {
        this.printTheType = printTheType;
    }

    public T getPrintTheType() {
        return printTheType;
    }

}
