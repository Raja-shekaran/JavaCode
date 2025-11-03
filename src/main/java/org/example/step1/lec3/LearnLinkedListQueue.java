package org.example.step1.lec3;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Demonstrates Queue operations in Java using LinkedList.
 *
 * Key Points:
 * - Queue follows FIFO (First In, First Out) order.
 * - LinkedList implements the Queue interface in Java.
 */
public class LearnLinkedListQueue {
    public static void main(String[] args) {

        // -----------------------------
        // Create a Queue of Integers
        // -----------------------------
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        System.out.println("Initial Queue: " + queue);

        // -----------------------------
        // Remove and Return Head Element
        // -----------------------------
        System.out.println("Removed (poll): " + queue.poll()); // removes 12
        System.out.println("Queue after poll: " + queue);

        // -----------------------------
        // Peek (View Head Element)
        // -----------------------------
        System.out.println("Head element (peek): " + queue.peek());

        // -----------------------------
        // Notes on Queue Methods
        // -----------------------------
        // offer()   → Adds element, returns true/false if successful.
        // add()     → Adds element, throws exception if insertion fails.
        // peek()    → Returns head element, returns null if empty.
        // element() → Returns head element, throws exception if empty.
        // poll()    → Removes & returns head, returns null if empty.
        // remove()  → Removes & returns head, throws exception if empty.
    }
}
