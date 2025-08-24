package com.sandip.LinkLists;

public class DetectRemoveCycle {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
//detect loop

    public static boolean isLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;

        }
        return false;
    }
    //detect and remove loop from linkedList;

    public static void detectRemoveLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;

        }
        if (slow != fast) return;
        slow = head;
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }

    public static void printList(Node head) {
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

        head.next = a;
        a.next = b;
        b.next = c;
        c.next = a;
        System.out.println(isLoop(head));
        System.out.println();
        detectRemoveLoop(head);
        printList(head);


    }
}
