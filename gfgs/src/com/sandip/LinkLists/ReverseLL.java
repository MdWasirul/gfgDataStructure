package com.sandip.LinkLists;

import java.util.ArrayList;

public class ReverseLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    //    public static Node reverseL(Node head) {
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        for (Node curr = head; curr != null; curr = curr.next) {
//            arr.add(curr.data);
//        }
//        for (Node curr = head; curr != null; curr = curr.next) {
//            curr.data = arr.remove(arr.size() - 1);
//        }
//        return head;
//    }
    public static Node reverseL(Node head) {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void removeDuplicate(Node head) {
        if (head == null) return;
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node a = new Node(20);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(30);
        Node e = new Node(30);

        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
//        display(head);
//        System.out.println();
//        head = reverseL(head);
        display(head);

//        System.out.println();
//        head = reverseL(head);
//        display(head);
        System.out.println();
        removeDuplicate(head);
        display(head);

    }
}
