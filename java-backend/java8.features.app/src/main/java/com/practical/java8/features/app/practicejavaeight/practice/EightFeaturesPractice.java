package com.practical.java8.features.app.practicejavaeight.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EightFeaturesPractice {

    public static void main(String[] args) {

        long[] array1 = {1, 2, 3, 2, 4, 1, 5, 6, 7, 9, 1, 0};
        long[] array2 = {1, 2, 3, 2, 4, 1, 5, 6, 6, 9, 1, 0};

        List<Long> listOne = Arrays.stream(array1).boxed().collect(Collectors.toList());
        List<Long> listTwo = Arrays.stream(array2).boxed().collect(Collectors.toList());
        listOne.addAll(listTwo);

        listOne = listOne.stream().distinct().collect(Collectors.toList());

//        System.out.println(listOne);

//        Random random = ;
//        Supplier<Integer> supplier = elements -> random.nextInt();
        Stream.generate(new Random()::nextInt)
                .filter(value -> value > 0 && String.valueOf(value).length() == 10)
                .limit(10).forEach(System.out::println);

    }

    private static native void initIDs();
}
