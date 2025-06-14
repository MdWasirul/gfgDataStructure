package com.sandip.arrays;

import java.util.Arrays;

//Left Rotate Element By  d  i.e. d=no. of position that left
// {1,2,3,4,5} => d=2 => {3,4,5,1,2}
public class leftRotateD {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
//        leftRotate(arr, 2);
//        System.out.println(Arrays.toString(arr));
        //-----------Method 2:
//        leftRotateMethod2(arr, 2);
//        System.out.println(Arrays.toString(arr));

        //----------------Method 3:
        leftRotateMethod3(arr, 2);
        System.out.println(Arrays.toString(arr));

    }

    //Method 1:Naive Solution
    static void leftRotateOne(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];

        }
        arr[(arr.length) - 1] = temp;
    }

    static void leftRotate(int[] arr, int d) {
        for (int i = 0; i < d; i++) {
            leftRotateOne(arr);

        }
    }

    //Method 2: Better 0(n+d) time + 0(d) Aux space;
    // {1,2,3,4,5} => d=2 => {3,4,5,1,2}
    static void leftRotateMethod2(int[] arr, int d) {
        int n = arr.length;
        if (d == 0 || d == n) return;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }

    }

    //Method 3: 0(n) time and 0(1) Aux
    static void leftRotateMethod3(int[] arr, int d) {
        int n = arr.length;
        if (d == n || d == 0) return;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);

    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
