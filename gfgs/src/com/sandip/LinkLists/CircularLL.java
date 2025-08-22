package com.sandip.LinkLists;

public class CircularLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void printList(Node head) {
        if (head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;

        } while (temp != head);
    }

    public static Node inserAtBegin(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            temp.next = temp;

        }
//        else {
//            Node curr = head;
//            while (curr.next != head) {
//                curr = curr.next;
//            }
//            curr.next = temp;
//            temp.next = head;
//        }
//        return temp;
        else {
            temp.next = head.next;
            head.next = temp;

            int t = temp.data;
            temp.data = head.data;
            head.data = t;

        }
        return head;
    }

    //    public static Node insertAtEnd(Node head, int data) {
//        Node temp = new Node(data);
//        if (head == null) {
//            temp.next = temp;
//            return temp;
//        } else {
//            Node curr = head;
//            while (curr.next != head) {
//                curr = curr.next;
//            }
//            temp.next = head;
//            curr.next = temp;
//            return head;
//        }
//    }
    public static Node insertAtEndEffcient(Node head, int data) {
        Node temp = new Node(data);
        if (head == null) {
            temp.next = temp;
            return temp;
        } else {
            temp.next = head.next; // insert at second positions
            head.next = temp;
            //now swap and return new head for efficient time as New head will our temp Node;
            int t = temp.data;
            temp.data = head.data;
            head.data = t;
            return temp;

        }
    }

    public static Node deleteHead(Node head) {
        //takes head as argument return new head
        if (head == null) return null;
        if (head.next == head) return null;

        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = head.next;
        return curr.next;

    }
    //delete Kth node



    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(30);
        head.next.next = new Node(20);
        head.next.next.next = head;
        printList(head);
        System.out.println();
        head = inserAtBegin(head, 5);
        printList(head);

        System.out.println();
//        Node head=null;
//        head = insertAtEnd(head, 45);
        head = insertAtEndEffcient(head, 45);
        printList(head);
        System.out.println();
        head = deleteHead(head);
        printList(head);
    }
}
