package com.practical.java8.features.app.capegemini;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpDemo {

    public static void main(String[] args) {

        //        Find the employee with the Highest Salary from the list of employee objects using streams

        Employee employee1 = new Employee("John", 5, "Developer");
        Employee employee2 = new Employee("George", 2, "DBA");
        Employee employee3 = new Employee("Frank", 3, "QA");
        Employee employee4 = new Employee("Francis", 21000, "Developer");
        Employee employee5 = new Employee("Mark", 20000, "QA");

//        Skip the first 2 elements in a list and then print the rest using Streams
        Stream.of(employee1, employee2, employee3, employee4, employee5)
                .skip(2).forEach(System.out::println);

//        Find the sum of the squares of a list of integers using streams
        Optional<Integer> summation = Stream.of(employee1, employee2, employee3).
                map(Employee::getSalary)
                .map(a -> a * a).reduce(Integer::sum);
        int[] array = {9, 8, 7, 6, 5};
        Arrays.stream(array).boxed()
                .map(a -> a * a).reduce(Integer::sum);

        System.out.println(summation.get());


//        convert a list of strings to a map where key is the string. Value is the length of the string

        Map<String, Integer> map = Stream.of(employee1, employee2, employee3, employee4, employee5)
                .map(Employee::getEmpName)
                .collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(map);
//        create a stream pipeline to a group a list of strings by their length
        Map<Integer, List<String>> elements =
                Stream.of(employee1, employee2, employee3, employee4, employee5)
                        .map(Employee::getEmpName)
                        .collect(Collectors.groupingBy(String::length));

        System.out.println(elements);

//        Count the number of occurrences of each character in a string using streams

        String noOfOccurrence = "I am Alien";
        System.out.println("------------------------------------------");
        Map<Object, Long> element = Arrays.stream(noOfOccurrence.split("")).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(element);

        Optional<Employee> employee = Stream.of(employee1, employee2, employee3)
                .sorted(Comparator.comparing(Employee::getSalary))
                .skip(1)
                .findFirst();
        String empName = employee.get().getEmpName();

        System.out.println(empName);

//        Concatenate a List of Strings into a Single String, seperated by commas using streams

        String concatList = Stream.of(employee1, employee2, employee3).map(Employee::getEmpName).collect(Collectors.joining(","));
        System.out.println(concatList);

//        Find the first name of the oldest person in a list of Person Objects using streams

        Person person1 = new Person("Joe", LocalDate.of(1999, 10, 2));
        Person person2 = new Person("Lory", LocalDate.of(1998, 12, 23));
        Person person3 = new Person("May", LocalDate.of(2000, 9, 8));
        Optional<Person> personObj = Stream.of(person1, person2, person3).sorted(Comparator.comparing(Person::getDob))
                .skip(1).findFirst();
        System.out.println(personObj.get().getName());

//        Generate an infinite sequence of random numbers and print the first 10 using streams
        Stream.generate(new Random()::nextInt)
                .filter(a -> a > 0 && String.valueOf(a).length() == 5)
                .limit(10)
                .forEach(System.out::println);

    }
}
