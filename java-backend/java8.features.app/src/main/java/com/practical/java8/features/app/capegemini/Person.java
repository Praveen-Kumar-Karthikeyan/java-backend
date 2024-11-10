package com.practical.java8.features.app.capegemini;

import java.time.LocalDate;

public class Person {

    private String name;
    private LocalDate dob;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }

    public Person(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }
}
