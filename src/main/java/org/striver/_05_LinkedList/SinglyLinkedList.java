package org.striver._05_LinkedList;

class SLLNode {
    int data;
    SLLNode next;

    SLLNode(int data) {
        this.data = data;
    }

    SLLNode(int data, SLLNode next) {
        this.data = data;
        this.next = next;
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //Convert array to LinkedList
        SLLNode head = convertArrayToLinkedList(arr);
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
        SLLNode removedHead = removeHead(head);
        printLinkedList(removedHead);
        System.out.println();
        //Remove Tail
        SLLNode removedTailHead = removeTail(head);
        printLinkedList(removedTailHead);
        System.out.println();
        //Remove Kth Position
        SLLNode removedKthHead = removeKthElement(head, 3);
        printLinkedList(removedKthHead);
        System.out.println();
        //Remove Node with value
        SLLNode removeElementWithValue = removeNodeWithValue(head, 4);
        printLinkedList(removeElementWithValue);
        //Add at head
        SLLNode addedAtHead = addAtHead(head, 0);
        printLinkedList(addedAtHead);
        System.out.println();
        //Add at Tail
        SLLNode addedAtTail = addedAtTail(head, 6);
        printLinkedList(addedAtTail);
        System.out.println();
        //Add kth position
        SLLNode addAtKth = addAtKthPosition(head, 10, 3);
        printLinkedList(addAtKth);
        System.out.println();
        //Add before a value
        SLLNode addAtVal = addBeforeValue(head, 2, 10);
        printLinkedList(addAtVal);
        System.out.println();
    }

    public static SLLNode addBeforeValue(SLLNode head, int val, int newValue) {
        if (head == null) return null;
        if (head.data == val) {
            return new SLLNode(newValue, head);
        }
        SLLNode temp = head;
        while (temp != null) {
            if (temp.next.data == val) {
                SLLNode newSLLNode = new SLLNode(newValue);
                newSLLNode.next = temp.next;
                temp.next = newSLLNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static SLLNode addAtKthPosition(SLLNode head, int value, int k) {
        if (head == null) return new SLLNode(value);
        if (k == 1) return addAtHead(head, value);
        SLLNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == k - 1) {
                SLLNode newSLLNode = new SLLNode(value);
                newSLLNode.next = temp.next;
                temp.next = newSLLNode;
            }
            temp = temp.next;
        }
        return head;
    }


    public static SLLNode addedAtTail(SLLNode head, int value) {
        SLLNode temp = head;
        SLLNode newSLLNode = new SLLNode(value);
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newSLLNode;
        return head;
    }

    public static SLLNode addAtHead(SLLNode head, int value) {
        return new SLLNode(value, head);
    }

    public static SLLNode removeNodeWithValue(SLLNode head, int val) {
        if (head == null) return null;
        SLLNode temp = head, prev = null;
        while (temp != null) {
            if (temp.data == val) {
                prev.next = prev.next.next;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static SLLNode removeKthElement(SLLNode head, int k) {
        if (head == null) return null;
        if (k == 1) return removeHead(head);
        SLLNode temp = head, prev = null;
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

    public static SLLNode removeTail(SLLNode head) {
        if (head == null || head.next == null) return head;
        SLLNode temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static SLLNode removeHead(SLLNode head) {
        if (head == null) return head;
        head = head.next;
        return head;
    }

    public static boolean checkIfPresent(SLLNode head, int val) {
        SLLNode temp = head;
        while (temp != null) {
            if (temp.data == val) return true;
            temp = temp.next;
        }
        return false;
    }

    public static int lengthOfLinkedList(SLLNode head) {
        int count = 0;
        SLLNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void printLinkedList(SLLNode head) {
        SLLNode temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static SLLNode convertArrayToLinkedList(int[] arr) {
        SLLNode head = new SLLNode(arr[0]);
        SLLNode mover = head;
        for (int i = 1; i < arr.length; i++) {
            SLLNode temp = new SLLNode(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
}
