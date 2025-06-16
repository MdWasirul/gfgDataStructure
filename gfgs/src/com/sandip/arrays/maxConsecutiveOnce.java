package com.sandip.arrays;

//Our Task: Given a binary array, find the count of the maximum number of consecutive 1's present in the array.


public class maxConsecutiveOnce {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 0};
        int[] arr2 = {0, 0, 0, 0, 0}; //{1,1,1,1,1,1}=>6
        int[] arr3 = {1, 1, 1, 1, 1, 1};
//        maxConsecutive1(arr);
//        System.out.println(maxConsecutive1(arr));
        System.out.println(maxConsecutiveOnes(arr));
//        System.out.println(maxConsecutiveMethod2(arr3));
    }

    //Naive Solution ;
    static int maxConsecutive1(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 1) {
                    count++;
                } else break;
            }
            res = Math.max(count, res);
        }
        return res;

    }

    //Efficient Method
    static int maxConsecutiveMethod2(int[] arr) {
        int res = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                res = Math.max(count, res);
            } else {

                count = 0;
            }

        }

        return res;
    }

    //Efficient Method 2:
    static int maxConsecutiveOnes(int[] arr) {
        int res = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count = 0;
            } else {
                count++;
                res = Math.max(count, res);

            }

        }
        return res;
    }
}
