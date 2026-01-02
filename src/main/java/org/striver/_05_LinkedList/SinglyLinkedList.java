package org.striver._05_LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //Convert array to LinkedList
        Node head = convertArrayToLinkedList(arr);
        //Traversal
        printLinkedList(head);
        System.out.println();
        //Length
        System.out.println(lengthOfLinkedList(head));
        System.out.println();
        //Search
        System.out.println(checkIfPresent(head, 9));
        System.out.println();
        //Remove Head
        Node removedHead = removeHead(head);
        printLinkedList(removedHead);
        System.out.println();
        //Remove Tail
        Node removedTailHead = removeTail(head);
        printLinkedList(removedTailHead);
        System.out.println();
        //Remove Kth Position
        Node removedKthHead = removeKthElement(head, 3);
        printLinkedList(removedKthHead);
        System.out.println();
        //Remove Node with value
        Node removeElementWithValue = removeNodeWithValue(head, 4);
        printLinkedList(removeElementWithValue);
        //Add at head
        Node addedAtHead = addAtHead(head, 0);
        printLinkedList(addedAtHead);
        System.out.println();
        //Add at Tail
        Node addedAtTail = addedAtTail(head, 6);
        printLinkedList(addedAtTail);
        System.out.println();
        //Add kth position
        Node addAtKth = addAtKthPosition(head, 10, 3);
        printLinkedList(addAtKth);
        System.out.println();
        //Add before a value
        Node addAtVal = addBeforeValue(head, 2, 10);
        printLinkedList(addAtVal);
        System.out.println();
    }

    public static Node addBeforeValue(Node head, int val, int newValue) {
        if (head == null) return null;
        if (head.data == val) {
            return new Node(newValue, head);
        }
        Node temp = head;
        while (temp != null) {
            if (temp.next.data == val) {
                Node newNode = new Node(newValue);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static Node addAtKthPosition(Node head, int value, int k) {
        if (head == null) return new Node(value);
        if (k == 1) return addAtHead(head, value);
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == k - 1) {
                Node newNode = new Node(value);
                newNode.next = temp.next;
                temp.next = newNode;
            }
            temp = temp.next;
        }
        return head;
    }


    public static Node addedAtTail(Node head, int value) {
        Node temp = head;
        Node newNode = new Node(value);
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static Node addAtHead(Node head, int value) {
        return new Node(value, head);
    }

    public static Node removeNodeWithValue(Node head, int val) {
        if (head == null) return null;
        Node temp = head, prev = null;
        while (temp != null) {
            if (temp.data == val) {
                prev.next = prev.next.next;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static Node removeKthElement(Node head, int k) {
        if (head == null) return null;
        if (k == 1) return removeHead(head);
        Node temp = head, prev = null;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == k) {
                prev.next = prev.next.next;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static Node removeTail(Node head) {
        if (head == null || head.next == null) return head;
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static Node removeHead(Node head) {
        if (head == null) return head;
        head = head.next;
        return head;
    }

    public static boolean checkIfPresent(Node head, int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) return true;
            temp = temp.next;
        }
        return false;
    }

    public static int lengthOfLinkedList(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static Node convertArrayToLinkedList(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
}
