package org.example;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);

        Collections.reverse(ll);

//        LinkedList<Integer> ll1 = new LinkedList<>();
//
//        ll.descendingIterator().forEachRemaining(ll1::add);

        System.out.println(ll);
//        System.out.println(ll1);
    }
}
