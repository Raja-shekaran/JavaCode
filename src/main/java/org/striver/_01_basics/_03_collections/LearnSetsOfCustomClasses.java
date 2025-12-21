package org.striver._01_basics._03_collections;

import java.util.*;

// ------------------------------------------------------------
// Demonstration: Using Custom Classes (Student) with Collections
// ------------------------------------------------------------
//
// - When using objects (custom classes) in sets or maps,
//   you must override equals() and hashCode() to define uniqueness.
//
// - If you want to sort a collection of custom objects,
//   implement Comparable<T> or use a Comparator.
//
// ------------------------------------------------------------
public class LearnSetsOfCustomClasses {
    public static void main(String[] args) {

        // =====================================================
        // 1️⃣ Using a HashSet with Custom Class
        // =====================================================
        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Raja", 101));
        studentSet.add(new Student("Malik", 102));
        studentSet.add(new Student("Malik", 102)); // duplicate ignored due to same rollNo

        System.out.println("🔹 Students in HashSet:");
        for (Student s : studentSet) {
            System.out.println(s);
        }

        // Check uniqueness
        System.out.println("\nContains Malik (102)? " +
                studentSet.contains(new Student("Malik", 102)));

        // =====================================================
        // 2️⃣ Working with Lists and Sorting Custom Objects
        // =====================================================
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Raja", 103));
        studentList.add(new Student("Malik", 102));
        studentList.add(new Student("Zara", 105));
        studentList.add(new Student("Alex", 101));

        // Natural order (based on rollNo - compareTo)
        Collections.sort(studentList);
        System.out.println("\n🔹 Sorted by roll number (natural order):");
        for (Student s : studentList) {
            System.out.println(s);
        }

        // Custom Comparator (based on name)
        Collections.sort(studentList, (o1, o2) -> o1.name.compareTo(o2.name));
        System.out.println("\n🔹 Sorted by name (using Comparator):");
        for (Student s : studentList) {
            System.out.println(s);
        }

        // Compare two students manually
        Student s1 = new Student("Raja", 1);
        Student s2 = new Student("Malik", 2);
        System.out.println("\nComparison (s1 vs s2): " + s1.compareTo(s2));
    }
}

// ------------------------------------------------------------
// Custom Class: Student
// ------------------------------------------------------------
//
// Implements Comparable<Student> to allow sorting.
// Overrides equals() and hashCode() for Set uniqueness.
// ------------------------------------------------------------
class Student implements Comparable<Student> {
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // toString for readable output
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    // Two students are equal if their roll numbers match
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    // hashCode consistent with equals()
    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }

    // Default comparison logic — by roll number
    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.rollNo, o.rollNo);
    }

    // Alternate comparison example (commented):
    // @Override
    // public int compareTo(Student o) {
    //     return this.name.compareTo(o.name);
    // }
}
