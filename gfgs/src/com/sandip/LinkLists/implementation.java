package com.sandip.LinkLists;

public class implementation {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtEnd(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void insertAtFirst(int val) {
            Node temp = new Node(val);
            if (head == null) { //empty list
                head = tail = temp;
//                insertAtEnd(val);

            } else {
                // Not empty list
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAtPos(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (idx == size) {
                insertAtEnd(val);
                return;
            } else if (idx == 0) {
                insertAtFirst(val);
                return;

            } else if (idx < 0 || idx > size) {
                System.out.println("Wrong Index");

            }
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;

            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }

        int getAt(int idx) {
            if (idx < 0 || idx > size) {
                System.out.println("Wrong Index");
                return -1;
            }
            Node temp = head;

            for (int i = 1; i <= idx; i++) {
                temp = temp.next;

            }
            return temp.data;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();

        }

        //        int size() {  // O(n)
//            int count = 0;
//            Node temp = head;
//            while (temp != null) {
//                count++;
//                temp = temp.next;
//            }
//            return count;
//        }
        void deleteAt(int idx) {
            if (idx == 0) {
                head = head.next;
                size--;
                return;
            }
            Node temp = head;
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;

            }
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }

    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4); //4 head
        ll.insertAtEnd(8); //4 ->  8
        ll.display();
        ll.insertAtEnd(21);
        ll.display();
        ll.insertAtFirst(67);  // 67 -> 4 -> 8 -> 21
        ll.display();
        ll.insertAtPos(1, 15); // 67 -> 15 -> 4-> 8 -> 21
        ll.display();
        ll.insertAtPos(5, 30); // 67 -> 15 -> 4-> 8 -> 21
        ll.display();
        ll.insertAtPos(0, 100);  //100 -> 67 -> 15 -> 4-> 8 -> 21->30
        ll.display();
//        System.out.println(ll.head.data);
//        System.out.println(ll.getAt(4));
//        System.out.println();
//        System.out.println(ll.size());
//        System.out.println(ll.size);  //7
        ll.deleteAt(0);
        ll.display();
//        System.out.println(ll.tail.data);
    }
}
