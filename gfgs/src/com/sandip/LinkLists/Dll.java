package com.sandip.LinkLists;

//Double lInked lists

public class Dll {
    public static class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            data = d;
            prev = null;
            next = null;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node insertAtBegin(Node head, int data) {
        Node temp = new Node(data);
        temp.next = head;

        //check head is null or list a element
        if (head != null) {
            head.prev = temp;

        }

        return temp;
    }

    public static Node reverseDll(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;

            curr = curr.prev;
        }
        return prev.prev;

    }

    public static Node deleteHead(Node head) {
        if (head == null || head.next == null) {
            return null;
        } else {
            head = head.next;
            head.prev = null;
            return head;
        }
    }

    public static Node deleteLastNode(Node head) {
        Node temp = head;
        if (head == null) return null;
        if (head.next == null) return null;
//        while (temp.next.next != null) {
//            temp = temp.next;
//        }
//        temp.next = null;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
//        temp.prev=null;


        return head;
    }

    public static Node insertAtEnd(Node head, int data) {
        Node temp = new Node(data);
        Node curr = head;

        if (head == null) {
            return temp;
        }

        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;

    }

    public static void main(String[] args) {
//        Node head=null;
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);

        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        display(head);
        System.out.println();
        head = insertAtBegin(head, 5);
        display(head);
        System.out.println();
        head = insertAtEnd(head, 40);
        display(head);
        System.out.println();
//        head = reverseDll(head);
//        display(head);
        System.out.print(head.data);
        System.out.println();
        head = deleteHead(head);
        System.out.println(head.data);
        display(head);
        System.out.println();
        head = deleteLastNode(head);
        display(head);
    }
}
