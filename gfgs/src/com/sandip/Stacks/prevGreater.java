package com.sandip.Stacks;

import java.util.Stack;

public class prevGreater {

    static void prevGreaterEl(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    System.out.print(arr[j] + " ");
                    break;
                }

            }
            if (j == -1) {
                System.out.print("-1" + "\t");
            }
        }
    }

    public static void printPrevGreater(int arr[], int n) {

        Stack<Integer> s = new Stack<>();
        s.add(arr[0]);
        for (int i = 0; i < n; i++) {
            while (s.isEmpty() == false && s.peek() <= arr[i])
                s.pop();
            int pg = s.isEmpty() ? -1 : s.peek();
            System.out.print(pg + " ");
            s.add(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {15, 10, 18, 12, 4, 6, 2};
//        prevGreaterEl(arr);
        // o/p:  -1 , 15, -1, 18, 12, 12, 6;
        printPrevGreater(arr, arr.length);

    }
}
