package com.practical.java8.features.app.capegemini;

public class StreamsAPI {

    public static void main(String[] args) throws InterruptedException {

//        Arrays Based Java 8 interview Programs

        MyFunctionInterface add = Integer::sum;
        MyFunctionInterface sub = (element1, element2) -> element1 - element2;
        MyFunctionInterface multiply = (element1, element2) -> element1 * element2;
        System.out.println(add.performOperation(10, 2));
        System.out.println(sub.performOperation(10, 2));
        System.out.println(multiply.performOperation(10, 2));

        Runnable runnable = () -> System.out.println(" Thread Created " + Thread.currentThread().getName());
        Runnable runnable1 = () -> System.out.println(" Thread Created " + Thread.currentThread().getName());
        Runnable[] threadArray = {runnable, runnable1};
        int elementOne = 1;
        for (Runnable runnableLoop : threadArray) {
            Thread thread = new Thread(runnableLoop);
            thread.setName("User-Thread-George" + elementOne);
            elementOne++;
            thread.start();
        }


//        Thread.currentThread().join();

        String str1 = "Hello";
        String str2 = new String("Hello");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str1 == str2);
//        System.out.println(str3.hashCode());

    }

}
