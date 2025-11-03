package org.striver.step1.lec3;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Demonstrates usage of PriorityQueue in Java.
 *
 * Key Concepts:
 * - PriorityQueue is part of the Java Collections Framework.
 * - It is based on a heap data structure (min-heap by default).
 * - Elements are ordered according to their natural ordering or a custom Comparator.
 * - Does not allow null elements.
 *
 * Use Cases:
 * - Scheduling tasks by priority
 * - Finding k largest/smallest elements
 * - Implementing heaps efficiently
 */
public class LearnPriorityQueue {
    public static void main(String[] args) {

        // -----------------------------
        // Create a Max-Heap PriorityQueue
        // -----------------------------
        // Default PriorityQueue in Java is a MIN-HEAP.
        // To create a MAX-HEAP, pass Comparator.reverseOrder().
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        // Insert elements using offer()
        priorityQueue.offer(12);
        priorityQueue.offer(36);
        priorityQueue.offer(48);
        priorityQueue.offer(24);

        // Elements internally arranged based on heap property,
        // not strictly sorted when printed.
        System.out.println("PriorityQueue elements (heap view): " + priorityQueue);

        // -----------------------------
        // Remove and Access Operations
        // -----------------------------
        // poll() removes and returns the head (highest or lowest based on comparator)
        System.out.println("Removed (poll): " + priorityQueue.poll());
        System.out.println("After poll: " + priorityQueue);

        // peek() returns the head element without removing it
        System.out.println("Head element (peek): " + priorityQueue.peek());
    }
}
