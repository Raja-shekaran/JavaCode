package practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InterviewPrep {
    public static void main(String[] args) {
        CalculateInvoice printInvoice = new PrintInvoice();
        printInvoice.calculate();
        printInvoice.print();

        //Inheritance
        Shape circle = new Circle();
        Shape square = new Square();
        circle.area(4);
        square.area(4);

        //Polymorphism [Compile-Time]
        Square rectangle = new Square();
        rectangle.area(4,5);

        //Wrapper Classes - A class which wraps the primitive data types [wrap a primitive data type into this class object]
        //“Wrapper classes allow primitives to be used in object-required contexts—Collections, Generics, Reflection, Streams, etc.”
        int a = 100;
        Integer b = a; //Autoboxing primitive to wrapper
        int c = b; //Unboxing wrapper to primitive
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int d = 10;
        int e = 10;
        System.out.println(d == e); // true (primitive value comparison)

        String s1 = new String("raja");
        String s2 = new String("raja");

        System.out.println(s1 == s2);       // false (different objects)
        System.out.println(s1.equals(s2));  // true  (same value)

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());  // same hashCode (equal strings)

//        “Garbage Collection automatically removes unreachable objects in heap.
//        JVM identifies unreachable objects by checking GC Roots (stack variables, static references, threads, JNI refs).
//        Heap is divided into Young & Old generations; Minor GC cleans Young Gen and Major/Full GC cleans Old Gen.
//        Modern collectors include Serial, Parallel, CMS, G1 (default), ZGC, and Shenandoah.”

        //The string pool, also known as the string constant pool, is a special memory area within the Java Virtual Machine (JVM) heap, specifically designed to store string literals
        String s = "Java"; // "Java" is created in the string pool
        String ss = "Java"; // s2 refers to the same "Java" object in the pool as s1
        String s3 = new String("Java"); // A new "Java" object is created in the heap (outside the pool)
        String s4 = s3.intern(); // s4 refers to the "Java" object in the string pool
        //hashCode() remains constant and thread safe

        //String thread Safe as its immutable
        //StringBuffer is also thread safe mutable methods are synchronized
        //StringBuilder is mutable and doesn't have any lock and is not safe for multi thread environment

        //ArrayList uses Dynamic Array internally
        //O(1) for random access
        //O(n) for insertion/deletion due to shifting
        //Suitable for random access and less insertion
        //Resizes by 1.5× when full

        //LinkedList uses Doubly Linked List internally
        //O(n) for random access
        //O(1) for insertion/deletion
        //Suitable for frequent insertion/deletion and less random access

        //HashSet handles duplicates internally - it used hashmap where internally hashing occurs(hashCode() and equals()) if the same hash found it is discarded
        //TreeSet is backed by a Red-Black Tree. It stores elements in a sorted and balanced tree structure. Sorting is achieved using either Comparable (natural ordering) or Comparator (custom ordering). Each insertion is placed based on compare(), and the tree balances itself, ensuring O(log n) search and insert.

        // HashMap stores key-value pairs in buckets.
        // hash(key) -> index = hash & (capacity - 1)
        // Collision: handled by linked list or red-black tree (Java 8+)
        // If key already exists -> equals() -> update
        // Resize: capacity doubles when size exceeds load factor 0.75

        //Why is HashMap not thread-safe? How does ConcurrentHashMap solve this?
        // HashMap is not thread-safe because it has no locking.
        // ConcurrentHashMap is thread-safe because it uses fine-grained bucket locking + CAS,
        // allowing multiple threads to operate safely without blocking the entire map.

        //Comparable vs Comparator
        //Comparable - Natural ordering - uses compareTo() - from lang
        //Comparator - Custom ordering - uses compare() - from util

        //PriorityQueue

        //ConcurrentModificationException

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

//        for(Integer num: list){
//            list.remove(num);
//        }

//        Iterator<Integer> it = list.iterator();
//        while(it.hasNext()){
//            it.remove();
//        }

        System.out.println(list);


    }
}

//Encapsulation - Binding of states/variables and methods in to a single entity or class - Real World Example is a Car that has the properties like color brand and can perform start accelerate and stop
class Car {
    private String color;
    private String brand;

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    void accelerate(){};
    void start(){};
    void stop(){};
}

//Abstraction - Hiding the implementation of the methods - Real World Example is Invoicing all users is concerned about the final invoice no the implementation part that generates the invoice and its respective content
abstract class CalculateInvoice {
    abstract void calculate();
    abstract void print();
}

class PrintInvoice extends CalculateInvoice {

    @Override
    void calculate() {
        System.out.println("Invoice Calculated");
    }

    @Override
    void print() {
        System.out.println("Invoice Printed");
    }
}

//Via Interface, we can achieve 100% abstraction

//Inheritance - One class(subclass) inherits properties from another class(superclass) - Real Life Example where a Shape class extended by Circle and Rectangle
class Shape{
    void area(double r){};
}

class Circle extends Shape{
    @Override
    void area(double r){
        System.out.println(3.14*r*r);
    }
}

class Square extends Shape{
    @Override
    void area(double r){
        System.out.println(r*r);
    }

    //Compile-time polymorphism with different parameters
    void area(double l,double b){
        System.out.println(l*b);
    }
}

//Polymorphism - Same methods have multiple behaviours - i can re refer the same example used in Inheritance example @Override area method is a run-time polymorphism and compile-time as well for rectangle with same method but different parameters

//Class - Blueprint which objects are created and contains attributes and functions

//Object - Instance of a class holds state and behaviour

//AbstractClass - can have both abstract and non abstract method , 100% abstraction cannot be achieved Keywords abstract and extends

//Interface - cannot have non abstract method, supports multiple inheritance and abstraction can be achieved 100% Keywords interface and implements


//Immutable class are the classes whose object cannot be changed after initialisation
//use final and private and don't add any setters
final class Test{
    private final String subject;
    private final int marks;

    Test(String subject, int marks) {
        this.subject = subject;
        this.marks = marks;
    }

    public String getSubject(){
        return this.subject;
    }

    public int getMarks(){
        return this.marks;
    }
}
