package com.sandip.Stacks;

public class Test2 {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    private static class MyStack {
        //        Node head=null;
////        Node tail=null;
//        int size=0;
        Node head;
        int size;

        MyStack() {
            head = null;
            size = 0;
        }

        int size() {
            return size;
        }

        boolean isEmpty() {
            return (head == null);
        }

        void push(int data) {
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop() {
            if (head == null) {
                return Integer.MAX_VALUE;
            }
            int res = head.data;
            head = head.next;
            size--;
            return res;
        }

        int peek() {
            if (head == null) {
                return Integer.MAX_VALUE;
            }
            return head.data;
        }


    }

    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(5);
        s.push(20);
        s.push(30);
        System.out.print(s.peek() + " ");
        System.out.println(s.pop());
        System.out.println(s.size());

    }

}
