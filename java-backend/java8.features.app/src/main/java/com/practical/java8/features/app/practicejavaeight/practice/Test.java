package com.practical.java8.features.app.practicejavaeight.practice;

public class Test {

    public static void main(String[] args) {
//        SingletonEg singleObj = SingletonEg.returnSingleObject();
//        System.out.println(singleObj.hashCode());
//        SingletonEg singleObjOne = SingletonEg.returnSingleObject();
//        System.out.println(singleObjOne.hashCode());

        String someName = "Hello I am Alien From Mars";
        System.out.println(someName.length());
        for (int a = someName.length() - 1; a >= 0; a--) {
            System.out.print(someName.charAt(a));
        }

    }
}
