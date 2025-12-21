# 🧠 Java Collections Framework — Striver's A2Z DSA Recap

This document gives a beginner-friendly recap of **Java Collections Framework (JCF)**, aligned with **Striver’s A2Z DSA course**. Use it as a quick reference while revising.

---

## 🚀 Why Collections?
Arrays are fixed in size and lack built-in operations like search, sort, and remove.  
Collections in Java solve this by providing **dynamic**, **type-safe**, and **ready-to-use** data structures under the `java.util` package.

---

## 🏗️ Framework Overview

### 📚 Hierarchy

![Hierarchy](images/img.png)

---

## 🧩 Main Interfaces & Classes

### 🔹 List (Ordered, allows duplicates)
- **ArrayList** → Dynamic array, fast access, slower insert/delete in middle.
- **LinkedList** → Doubly linked, fast insert/delete, slow random access.
- **Vector** → Like ArrayList but synchronized (old, rarely used).

Example:
```java
List<String> names = new ArrayList<>();
names.add("Rahul");
names.add("Riya");
System.out.println(names.get(0)); // Rahul
```

---

### 🔸 Set (Unordered, no duplicates)
- **HashSet** → Unordered, fastest lookup (O(1) avg).
- **LinkedHashSet** → Keeps insertion order.
- **TreeSet** → Sorted order (O(log n) operations).

Example:
```java
Set<Integer> set = new HashSet<>();
set.add(1);
set.add(2);
set.add(1); // Ignored
System.out.println(set); // [1, 2]
```

---

### 🔹 Queue (FIFO — First In First Out)
- **LinkedList** → Also implements Queue.
- **PriorityQueue** → Elements ordered by priority (min-heap by default).
- **ArrayDeque** → Double-ended queue (fastest general queue).

Example:
```java
Queue<Integer> q = new LinkedList<>();
q.add(10);
q.add(20);
System.out.println(q.poll()); // 10
```

---

### 🔸 Map (Key–Value pairs)
- **HashMap** → Fastest lookup (O(1) avg), no order.
- **LinkedHashMap** → Maintains insertion order.
- **TreeMap** → Sorted keys.

Example:
```java
Map<String, Integer> marks = new HashMap<>();
marks.put("Maths", 95);
marks.put("Science", 90);
System.out.println(marks.get("Maths")); // 95
```

---

## ⚙️ Generics & Type Safety
Ensures only specific data types are stored.

```java
List<Integer> nums = new ArrayList<>();
nums.add(10);
// nums.add("Hello"); // Compile-time error
```

---

## 🛠️ Collections Utility Class
Helper methods for sorting, reversing, shuffling, etc.

```java
List<Integer> nums = Arrays.asList(3, 1, 2);
Collections.sort(nums);
Collections.reverse(nums);
System.out.println(nums); // [3, 2, 1]
```

---

## 🧾 Summary Table

| Type | Order | Duplicates | Nulls | Common Classes | Use-Case |
|------|--------|-------------|--------|----------------|-----------|
| **List** | Yes | Yes | Yes | ArrayList, LinkedList | Ordered data |
| **Set** | Depends | No | HashSet (1 null) | Unique elements |
| **Queue** | FIFO | Yes | Limited | LinkedList, ArrayDeque | Task scheduling |
| **Map** | Key-based | Keys No, Values Yes | HashMap (1 null key) | Key-value lookup |
