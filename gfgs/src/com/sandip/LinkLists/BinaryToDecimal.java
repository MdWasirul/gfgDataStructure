package com.sandip.LinkLists;

public class BinaryToDecimal {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static int getDecimalValue(Node head) {
        Node temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        temp = head;
        int sum = 0;
        while (temp != null) {
            sum = sum + (temp.data) * (int) Math.pow(2, --length);
            temp = temp.next;
        }
        return sum;

    }

    // 1 -> 0 -> 1-> null
    public static void main(String[] args) {
        Node head = new Node(1);
        Node b = new Node(0);
        Node c = new Node(1);
        Node d = new Node(1);
        head.next = b;
        b.next = c;
        c.next = d;
        printList(head);
        System.out.println();
        System.out.println(getDecimalValue(head));
    }
}
