package org.example.step1.lec3;

import java.util.*;

// Demonstration of using custom classes inside a Set (HashSet in this case)
// A Set stores unique elements — so we must define how two Students are "equal"
// using equals() and hashCode().
public class LearnSetsOfCustomClasses {
    public static void main(String[] args) {

        // -----------------------------
        // Create a HashSet of Students
        // -----------------------------
        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Raja", 101));
        studentSet.add(new Student("Malik", 102));
        studentSet.add(new Student("Malik", 102)); // duplicate (ignored)

        // -----------------------------
        // Print all students
        // -----------------------------
        System.out.println("Students in Set:");
        for (Student s : studentSet) {
            System.out.println(s);
        }

        // -----------------------------
        // Verify uniqueness by roll number
        // -----------------------------
        System.out.println("\nContains Malik (102)? " +
                studentSet.contains(new Student("Malik", 102)));

        // Output will show that duplicates are not added
    }
}

// ---------------------------------------
// Student class used in the HashSet
// ---------------------------------------
class Student {
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Display readable output when printing the Set
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    // Two students are considered equal if their roll numbers match
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    // Ensure hashCode consistency with equals()
    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }
}
