package com.sandip.LinkLists;

public class reverseInGroup {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverseG(Node head, int k) {
        Node curr = head;
        Node prev = null, next = null;
        int count = 0;
        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if (next != null) {
            Node rest_head = reverseG(next, k);
            head.next = rest_head;
        }
        return prev;
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node a = new Node(20);
        Node b = new Node(30);
        Node c = new Node(40);
        Node d = new Node(50);
        Node e = new Node(60);
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        head = reverseG(head, 3);
        display(head);

    }
}
