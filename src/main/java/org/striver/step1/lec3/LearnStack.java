package org.striver.step1.lec3;

import java.util.Stack;

/**
 * Demonstrates Stack operations in Java.
 *
 * Key Points:
 * - Stack follows LIFO (Last In, First Out) order.
 * - Elements are added and removed from the top of the stack.
 * - Stack is a legacy class in Java (extends Vector).
 */
public class LearnStack {
    public static void main(String[] args) {

        // -----------------------------
        // Create a Stack of Strings
        // -----------------------------
        Stack<String> newStack = new Stack<>();

        // Push elements onto the stack
        newStack.push("Tiger");
        newStack.push("Lion");
        System.out.println("Initial Stack: " + newStack);

        // -----------------------------
        // Peek (View top element)
        // -----------------------------
        System.out.println("Top element (peek): " + newStack.peek());

        // -----------------------------
        // Pop (Remove top element)
        // -----------------------------
        System.out.println("Popped element: " + newStack.pop());
        System.out.println("Stack after pop: " + newStack);

        // -----------------------------
        // Peek again (check current top)
        // -----------------------------
        System.out.println("Current top (peek): " + newStack.peek());
    }
}
