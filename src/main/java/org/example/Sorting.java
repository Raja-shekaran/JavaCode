package org.example;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        // Creating a list of Employee objects
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 50000, 28));
        employees.add(new Employee("Alice", 60000, 25));
        employees.add(new Employee("Bob", 45000, 30));
        employees.add(new Employee("David", 70000, 35));
        employees.add(new Employee("Eve", 65000, 27));

        // Call the sorting logic here (fill your sorting logic)

        // Example placeholder: Sort by name (ascending)
        System.out.println("Sorted by Name: Traditional");
        employees.sort((a,b) -> b.getName().compareTo(a.getName()));
        employees.forEach(System.out::println);

        System.out.println();

        //Java 8
        System.out.println("Sorted by Name: Java8");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getName, Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}
