package com.sandip.LinkLists;


public class basicll {

    public static void displayRecursive(Node head) {
        if (head == null) return;
//        System.out.print(head.data + " ");
        displayRecursive(head.next);
        System.out.print(head.data + " ");  ///16 8 9 3 5  reverse order

    }

    public static int length(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void insertAtEnd(Node head, int val) {
        Node temp = new Node(val);
        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = temp;
    }

    public static class Node {  //Node-> ek data Type hong Node type ka;
        int data;  //value
        Node next;  //address of next node (contain next Node)

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);  //head
//        System.out.println(a.next); //null
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        //5 3 9 8 16
        a.next = b;  // 5->3 9 8 16
        b.next = c;  // 5 -> 3 -> 9 8 16
        c.next = d;  // 5 -> 3 -> 9 -> 8 16
        d.next = e;  // 5 -> 3 -> 9-> 8 -> 16
//        System.out.println(a.data);
//        System.out.println(b.data);
//        System.out.println(a.next.data);
//        System.out.println(a); //Node@2f4d3709
//        System.out.println(a.next); //Node@4e50df2e
//        System.out.println(b); //Node@4e50df2e
//        System.out.println(c); //Node@1d81eb93
//        Node temp = a; //temp v node a  ko point kr rha hong
//        System.out.println(temp.data);
//        for (int i = 1; i <=5 ; i++) {
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//
//        }
        //when no of iteration unknown
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
        //print using functions;
        display(a);
        System.out.println();
//        displayRecursive(a);
//        System.out.println();
//        System.out.println(length(a));
        insertAtEnd(a, 30);
        display(a);
    }
}
