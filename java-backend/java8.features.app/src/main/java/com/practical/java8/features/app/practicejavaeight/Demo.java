package com.practical.java8.features.app.practicejavaeight;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//import java.util.stream.Collectors;
//import static java.util.stream.Collectors.groupingBy;

public class Demo {

    public static void main(String[] args) {

        List<Employee> employeeList = EmployeeDataBase.getAllEmployees();

        Function<Employee, String> getNameFn = Employee::getName;

        Predicate<String> checkCondition = element -> element.startsWith("J");

        Consumer<String> printStrings = System.out::println;

        employeeList.stream()
                .map(getNameFn)
                .filter(checkCondition);
//                .forEach(printStrings);

//        IntStream.rangeClosed(1, 10001).forEach(System.out::println);

        int[] arrayOne = {1, 2, 3, 2, 4, 1, 5, 6, 7, 9, 1, 0};

        Arrays.stream(arrayOne).distinct();
//                .forEach(System.out::println);
        Map<String, List<String>> employeesGroupedByGender =
                employeeList.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getGender, Collectors.mapping(Employee::getName, Collectors.toList())
                        ));
//        System.out.println(employeesGroupedByGender);

//        Merge two lists of integers and remove duplicate using streams

        int[] arrayTwo = {1, 2, 3, 2, 4, 1, 5, 6, 6, 9, 1, 0};

        Set<Integer> arrayOneList = Arrays.stream(arrayOne).boxed().collect(Collectors.toSet());
        Set<Integer> arrayTwoList = Arrays.stream(arrayTwo).boxed().collect(Collectors.toSet());

        arrayOneList.addAll(arrayTwoList);
//        arrayOneList.forEach(System.out::println);

//        Check if any string in a list starts with a specific prefix using streams

        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("John");
        listOfStrings.add("George");
        listOfStrings.add("Gregory");
        listOfStrings.add("Money");
        listOfStrings.add("Betel");
        listOfStrings.add("Leaves");
        listOfStrings.add("Lorry");

        Predicate<String> startsWithPrefix = element -> element.startsWith("G");
        List<String> startsWithG = listOfStrings.stream().filter(startsWithPrefix).collect(Collectors.toList());
//        System.out.println(startsWithG);

//        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")));
//  -MMM-

        LocalDateTime startTime = LocalDateTime.now();
//        System.out.println("startTime : " + startTime);
//        for (int a = 0; a <= 10000; a++)
//            System.out.print("");
//        try {
////            Thread.sleep(9000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//            Thread.currentThread().interrupt();
//        }
        LocalDateTime endTime = LocalDateTime.now();
//        System.out.println("endTime : " + endTime);
        Duration difference = Duration.between(startTime, endTime);
//        System.out.println(difference.getSeconds());


        //   06-11-2024
        LocalDate localDate = LocalDate.of(2024, 11, 6);
//        System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));


//        Count the number of occurrences of each character in a string using streams

        String countChars = "Leo Das is a bad ass";

//        Function<String[], String> counterFn = (element) -> element

        Map<String, Long> counters = Arrays.stream(countChars.split("")).collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()));

//        System.out.println(counters);


        int[] arrayOfElements = {1, 2, 3, 2, 4, 1, 5, 6, 6, 9, 1, 0};

        OptionalInt maxOf = Arrays.stream(arrayOfElements)
                .distinct()
                .skip(1)
                .limit(4)
                .max();

        System.out.println(maxOf);
//                .forEach(System.out::println);

//        Find the product of all elements in a list of integers using streams

        int[] productArray = {1, 2, 3, 2, 4, 1, 5, 6, 6, 9, 1};
//        IntBinaryOperator pdtFn = (elementOne, elementTwo) -> elementOne * elementTwo;
        IntBinaryOperator pdtFn = Integer::max;
        OptionalInt product = Arrays.stream(productArray)
                .distinct()
                .skip(1)
                .reduce(pdtFn);
        int response = product.getAsInt();
        System.out.println("Product of the Array " + response);

        System.out.println("Hello");


    }

}
