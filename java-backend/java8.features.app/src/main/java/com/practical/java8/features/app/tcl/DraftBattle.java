package com.practical.java8.features.app.tcl;

import java.util.Arrays;

public class DraftBattle {

    public static void main(String[] args) {

//      1.  Starts
//•	Write a Java program that finds and prints only the characters from a string that repeat exactly two times

//        String str = "Hello I am Alien";
//
//        Consumer<Map.Entry<String, Long>> entryConsumer = element -> {
//            if (element.getValue() == 2)
//                System.out.println(element);
//        };
//
//        Arrays.stream(str.split(""))
//                .collect(Collectors.groupingBy(
//                        Function.identity()
//                        , Collectors.counting()
//                )).entrySet()
//                .forEach(entryConsumer);

//        1. Ends

//        •	Given two unsorted arrays, merge them into a single array and sort the resulting array in ascending order

        int[] array1 = {9, 3, 45, 612, 50};
        int[] array2 = {19, 30, 54, 12, 90};

//        int[] array1 = {7, 3, 9, 1};   a = 7 > b =3  int temp = 7(a); a = (3)b; b= (7)temp
//        int[] array2 = {4, 8, 2, 5};

        int[] resultantArr = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, resultantArr, 0, array1.length);
        System.arraycopy(array2, 0, resultantArr, array1.length, array2.length);
        System.out.println(Arrays.toString(bubbleSort(resultantArr)));
    }

    private static int[] bubbleSort(int[] array) {  // 5 - 0,1,2,3,4
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {  // a > b - Asc ... a < b Dsc
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }


}