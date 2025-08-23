package com.sandip.LinkLists;

public class nthNode {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node nthNodeFromEnd(Node head, int pos) {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (size < pos) return null;
        temp = head;
        int mth = size - pos + 1;
        for (int i = 1; i <= mth - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public static Node nthNodeEnd(Node head, int pos) {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= pos; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static Node deleteNthNode(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;

        }
        if (fast == null) {
            head = head.next;
            return head;

        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;

    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
//        Node temp = nthNodeFromEnd(a, 2);
//        System.out.println(temp.data);

//        Node temp = nthNodeEnd(a, 2);
//        System.out.println(temp.data);

        display(a);
        a = deleteNthNode(a, 7);
        System.out.println();
        display(a);

    }
}
