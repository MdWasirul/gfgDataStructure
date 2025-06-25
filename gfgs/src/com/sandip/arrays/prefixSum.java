package com.sandip.arrays;

import java.util.Arrays;

public class prefixSum {
    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 9, 6, 5, 4};
        int[] arr2 = {10, 20, 10, 5, 15};
//        System.out.println(Arrays.toString(getSum(arr)));
//        System.out.println(getSumRange(arr, 2, 6));
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        System.out.println(Arrays.toString(prefixSum));
        System.out.println(getSumEfficient(prefixSum, 0, 2));
        System.out.println(getSumEfficient(prefixSum, 2, 6));
        System.out.println(getSumEfficient(prefixSum,1,3));
    }

    /*
    Given an array arr[] of size n, the task is to find the prefix sum of the array.
    A prefix sum array is another array prefixSum[] of the same size,
    such that prefixSum[i] is arr[0] + arr[1] + arr[2] . . . arr[i].
    Input: arr[] = [10, 20, 10, 5, 15]
   Output: 10 30 40 45 60
   Explanation: For each index i, add all the elements from 0 to i:
   prefixSum[0] = 10,
   prefixSum[1] = 10 + 20 = 30,
   prefixSum[2] = 10 + 20 + 10 = 40 and so on.
     */
    //Prefix Sum:
    static int[] getSum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }


    //Naive Solution:
    static int getSumRange(int[] arr, int start, int end) {
        int n = arr.length;
        int res = 0;
        for (int i = start; i <= end; i++) {
            res = res + arr[i];
        }
        return res;
    }

    //Efficient Solution : Using  PrefixSum-

    static int getSumEfficient(int[] pS, int l, int r) {

        if (l == 0) {
            return pS[r];
        }
        return pS[r] - pS[l - 1];
    }

}



