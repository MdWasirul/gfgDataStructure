package com.sandip.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//1 2 3 4 5
public class reverseFirstK {
    public static Queue<Integer> removeFtK(int k, Queue<Integer> queue) {
        if (queue == null || k <= 0 || k > queue.size()) {
            return queue;
        }
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < 3; i++) {
            st.add(queue.remove());

        }
        while (st.size() > 0) { //4 5 3 2 1
            queue.add(st.pop());
        }
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.remove());

        }
        return queue;

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        int k = 3;
        q = removeFtK(k, q);
        System.out.println(q);
    }
}