package org.striver.step1.lec3;

import java.util.ArrayDeque;

/**
 * Demonstrates the usage of ArrayDeque in Java.
 *
 * Key Concepts:
 * - ArrayDeque (part of java.util) implements both Queue and Deque interfaces.
 * - It is a resizable array-based double-ended queue.
 * - Faster than LinkedList when used as a stack or queue.
 * - Does NOT allow null elements.
 *
 * Common Use-Cases:
 * - Implementing a Stack (LIFO)
 * - Implementing a Queue (FIFO)
 * - Double-ended processing (Deque)
 */
public class LearnArrayDeque {
    public static void main(String[] args) {

        // -----------------------------
        // Basic Deque Operations
        // -----------------------------
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        // offer() -> adds element at the tail
        arrayDeque.offer(23);

        // offerFirst() -> adds element at the head
        arrayDeque.offerFirst(24);

        // offerLast() -> adds element at the tail (same as offer)
        arrayDeque.offerLast(25);

        System.out.println("Initial Deque: " + arrayDeque);

        // -----------------------------
        // Peek Operations (Read without removing)
        // -----------------------------
        System.out.println("First element (peekFirst): " + arrayDeque.peekFirst());
        System.out.println("Last element (peekLast): " + arrayDeque.peekLast());

        System.out.println("Deque after peeks (unchanged): " + arrayDeque);

        // -----------------------------
        // Poll Operations (Remove and return)
        // -----------------------------
        System.out.println("Removed from front (pollFirst): " + arrayDeque.pollFirst());
        System.out.println("Removed from end (pollLast): " + arrayDeque.pollLast());

        System.out.println("Deque after poll operations: " + arrayDeque);

        // -----------------------------
        // Stack-like usage (LIFO)
        // -----------------------------
        arrayDeque.push(10); // same as offerFirst()
        arrayDeque.push(20);
        System.out.println("As Stack (after pushes): " + arrayDeque);

        System.out.println("Pop element (LIFO): " + arrayDeque.pop());
        System.out.println("After pop: " + arrayDeque);

        // -----------------------------
        // Queue-like usage (FIFO)
        // -----------------------------
        arrayDeque.clear();
        arrayDeque.offer(100);
        arrayDeque.offer(200);
        arrayDeque.offer(300);

        System.out.println("As Queue (FIFO): " + arrayDeque);
        System.out.println("Poll element (FIFO): " + arrayDeque.poll());
        System.out.println("After poll: " + arrayDeque);
    }
}
