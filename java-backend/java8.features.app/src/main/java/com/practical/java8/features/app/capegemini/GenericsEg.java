package com.practical.java8.features.app.capegemini;

import java.util.ArrayList;
import java.util.List;

public class GenericsEg {

    public static void main(String[] args) {
        Printer<Integer> integerPrinter = new Printer<>(19);
//        System.out.println(integerPrinter.getPrintTheType());
        Printer<Double> doublePrinter = new Printer<>(19.09);
//        System.out.println(doublePrinter.getPrintTheType());

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(12);
        integerList.add(11);
        integerList.add(21);
        System.out.println(printElements(integerList));
    }

    private static <T> T printElements(List<T> elements) {
//        elements.forEach(System.out::println);
        return elements.isEmpty() ? null : elements.get(0);
    }

}
