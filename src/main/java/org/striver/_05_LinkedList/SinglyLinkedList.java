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
        System.out.println();
        //Length
        System.out.println(lengthOfLinkedList(head));
        System.out.println();
        //Search
        System.out.println(checkIfPresent(head,9));
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
    }

    public static Node removeNodeWithValue(Node head, int val){
        if(head == null) return head;
        Node temp = head, prev = null;
        while (temp!=null){
            if(temp.data==val){
                prev.next = prev.next.next;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static Node removeKthElement(Node head, int k){
        if(head == null) return head;
        if(k==1) return removeHead(head);
        Node temp = head, prev = null;
        int count = 0;
        while (temp!=null){
            count++;
            if(count==k){
                prev.next = prev.next.next;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static Node removeTail(Node head){
        if(head == null || head.next == null) return head;
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static Node removeHead(Node head){
        if(head == null) return head;
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
