package com.practical.java8.features.app.capegemini;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenOddPrintUsingMultiThreading {

    private static final EvenOddPrintUsingMultiThreading multiThreading = new EvenOddPrintUsingMultiThreading();
    //     Print Even or Odd Number using Two Threads
    private final Object object = new Object();

    public static void main(String[] args) {
        IntPredicate evenPredicate = element -> element % 2 == 0;
        IntPredicate oddPredicate = element -> element % 3 == 0;
        CompletableFuture.runAsync(() -> multiThreading.setRange(evenPredicate));
        CompletableFuture.runAsync(() -> multiThreading.setRange(oddPredicate));
    }

    private void executeTheForEach(int number) {
        synchronized (object) {
            System.out.println(Thread.currentThread().getName() + " Even or Odd Number " + number);
            try {
                object.notifyAll();
                object.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }

    private void setRange(IntPredicate predicate) {
        IntStream.rangeClosed(1, 100).filter(predicate).forEach(multiThreading::executeTheForEach);
    }
}
