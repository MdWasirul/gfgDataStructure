package com.sandip.Queue;

import java.util.Stack;

//Implement Queue using stack  Q.232 leetcode.
//1 2 3 4
public class ImpleQueueUsingStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();

    //push Efficient  -->PUSH O(1), pop:O(n);
//    public void push(int x) {
//        st.push(x);
//
//    }
//
//    public int pop() {
//        while (st.size() > 1) {
//            helper.push(st.pop());
//        }
//        int val = st.pop();
//        while (helper.size() > 0) {
//            st.push(helper.pop());
//        }
//        return val;
//
//    }
//
//    public int peek() {
//        while (st.size() > 1) {
//            helper.push(st.pop());
//        }
//        int val = st.peek();
//        while (helper.size() > 0) {
//            st.push(helper.pop());
//        }
//        return val;
//
//    }
    //pop Efficient  POP->O(1) ,push :O(n)
    public void push(int x) {
        if (st.size() == 0) {
            st.push(x);
        } else {
            while (st.size() > 0) {
                helper.push(st.pop());
            }
            st.push(x);
            while (helper.size() > 0) {
                st.push(helper.pop());
            }
        }
    }

    public int pop() {
        return st.pop();
    }

    public int peek() {
        return st.peek();
    }

    public boolean isEmpty() {
        if (st.size() == 0) return true;
        else return false;
    }
}
