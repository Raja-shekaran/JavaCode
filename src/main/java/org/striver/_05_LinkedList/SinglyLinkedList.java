package org.striver._05_LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //Convert array to LinkedList
        Node head = convertArrayToLinkedList(arr);
        //Traversal
        printLinkedList(head);
        //Length
        System.out.println(lengthOfLinkedList(head));
        //Search
        System.out.println(checkIfPresent(head,9));
        //Remove Head
        Node removedHead = removeHead(head);
        printLinkedList(removedHead);
        //Remove Tail
        Node removedTailHead = removeTail(head);
        printLinkedList(removedTailHead);
    }

    public static Node removeTail(Node head){
        if(head == null || head.next == null) return null;
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static Node removeHead(Node head){
        if(head == null) return null;
        head = head.next;
        return head;
    }

    public static boolean checkIfPresent(Node head, int val){
        Node temp = head;
        while(temp!=null){
            if(temp.data == val) return true;
            temp=temp.next;
        }
        return false;
    }

    public static int lengthOfLinkedList(Node head){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public static void printLinkedList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static Node convertArrayToLinkedList(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

}
