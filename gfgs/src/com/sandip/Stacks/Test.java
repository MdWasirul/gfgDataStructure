package com.sandip.Stacks;

//Array Implementation of Stacks

import java.util.ArrayList;

class MyStack {
    int[] arr;
    int cap;
    int top;

    MyStack(int C) {
        cap = C;
        top = -1;
        arr = new int[cap];
    }

    void push(int x) {
        if (top == cap - 1) {
            System.out.println("Stack is Overflow");
        }
        top++;
        arr[top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
        }
        int res = arr[top];
        top--;
        return res;
    }

    int size() {
        return top + 1;
    }

    boolean isEmpty() {
        return top == -1;
    }


}

//Arraylist implementation:
class MyStack2 {
    ArrayList<Integer> al = new ArrayList<>();

    void push(int x) {

        al.add(x);
    }

    int pop() {
        int res = al.get(al.size() - 1);
        al.remove(al.size() - 1);
        return res;
    }

    int peek() {
        return al.get(al.size() - 1);

    }

    boolean isEmpty() {
        return al.isEmpty();
    }

    int size() {
        return al.size();
    }
}

public class Test {


    public static void main(String[] args) {
//        MyStack s = new MyStack(5);
//        s.push(5);
//        s.push(75);
//        System.out.println(s.pop());
//        s.push(30);
//        System.out.println(s.size());
        MyStack2 s = new MyStack2();
        s.push(5);
        s.push(20);
        System.out.println(s.size());
        System.out.println(s.pop());
        s.push(40);
        s.peek();
        System.out.println(s.peek());
        System.out.println(s.size());
    }


}
