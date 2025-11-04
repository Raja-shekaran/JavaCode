package org.striver.step1.lec3;

import java.util.*;

// ------------------------------------------------------------
// Demonstration: Collections Class in Java
// ------------------------------------------------------------
//
// The Collections class provides static utility methods
// to operate on collections (List, Set, etc.)
//
// Commonly used methods:
// - sort() / reverseOrder()
// - min() / max()
// - frequency()
// - reverse()
// - shuffle()
// - swap()
// ------------------------------------------------------------
public class LearnCollectionsClass {
    public static void main(String[] args) {

        // =====================================================
        // 1️⃣ Creating and Initializing a List
        // =====================================================
        List<Integer> list = new ArrayList<>();
        list.add(28);
        list.add(33);
        list.add(99);
        list.add(987);
        list.add(32);

        System.out.println("Original List: " + list);

        // =====================================================
        // 2️⃣ Sorting a List
        // =====================================================

        // Ascending order (natural order)
        Collections.sort(list);
        System.out.println("\nSorted (Ascending): " + list);

        // Descending order
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println("Sorted (Descending): " + list);

        // =====================================================
        // 3️⃣ Finding Min & Max Elements
        // =====================================================
        System.out.println("\nMaximum Element: " + Collections.max(list));
        System.out.println("Minimum Element: " + Collections.min(list));

        // =====================================================
        // 4️⃣ Using Other Common Collections Methods
        // =====================================================
        // Frequency of a specific element
        System.out.println("\nFrequency of 99: " + Collections.frequency(list, 99));

        // Reverse the list
        Collections.reverse(list);
        System.out.println("List after reverse: " + list);

        // Shuffle elements randomly
        Collections.shuffle(list);
        System.out.println("List after shuffle: " + list);

        // Swap elements (swap index 0 and 1)
        Collections.swap(list, 0, 1);
        System.out.println("List after swapping index 0 and 1: " + list);

        // =====================================================
        // 5️⃣ Creating Immutable / Singleton Collections
        // =====================================================
        List<Integer> singletonList = Collections.singletonList(10);
        System.out.println("\nSingleton List: " + singletonList);

        List<Integer> unmodifiableList = Collections.unmodifiableList(list);
        System.out.println("Unmodifiable List: " + unmodifiableList);

        // Uncommenting below line will throw UnsupportedOperationException
        // unmodifiableList.add(500);
    }
}
