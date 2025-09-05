package com.sandip.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class basicSTL {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.isEmpty());
        System.out.println(q);
        System.out.println(q.size());
        q.remove();
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println(q.size());

    }
}
