package org.striver._05_LinkedList;

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data, Node next, Node prev){
        this.data=data;
        this.next=next;
        this.prev=prev;
    }

    Node(int data){
        this.data=data;
    }
}

public class DoublyLinkedList {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //Convert array to LinkedList
        Node head = convertArrayToLinkedList(arr);
        printLinkedList(head);
    }

    public static Node convertArrayToLinkedList(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1;i< arr.length;i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = prev.next;
        }
        return head;
    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data   );
            temp = temp.next;
        }
    }
}


