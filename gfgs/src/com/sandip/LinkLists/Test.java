package com.sandip.LinkLists;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Test {
    public static void main(String[] args) {
//        Node head =new Node(10);
//        Node temp1=new Node(20);
//        Node temp2=new Node(30);
//
//        head.next=temp1;
//        temp1.next=temp2;
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printlist(head);
    }

    static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

//    static ListNode removeElements(ListNode head, int val) {
//
//
//    }
}
