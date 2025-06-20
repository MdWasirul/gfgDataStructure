package com.sandip.arrays;

//Sliding Window Technique
//Finding maximum Sum of K consecutive Element;
public class maxSumKConsecutiveEl {
    public static void main(String[] args) {
        int[] arr = {1, 8, 30, -5, 20, 7};
        int[] arr2 = {5, -10, 6, 90, 3};
//        System.out.println(maxSumK(arr2, 2));
//        System.out.println(maxSum(arr2, 2));
        System.out.println(maxSumSlW(arr, 3));
    }

    /*The Naive Approach to solve this problem is to calculate sum for each of the blocks of
     K consecutive elements and compare which block has the maximum sum possible.*/

    static int maxSumK(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n - k + 1; i++) {
            int curr_Sum = 0;
            for (int j = 0; j < k; j++) {

                curr_Sum = curr_Sum + arr[i + j];
            }
            maxSum = Math.max(curr_Sum, maxSum);
        }
        return maxSum;
    }

    static int maxSum(int[] arr, int k) {
        int n = arr.length;
        int res = Integer.MIN_VALUE;
        for (int i = 0; i + k - 1 < n; i++) {
            int curr_Sum = 0;
            for (int j = 0; j < k; j++) {

                curr_Sum = curr_Sum + arr[i + j];
            }
            res = Math.max(curr_Sum, res);
        }
        return res;
    }
    //Efficient approach using Sliding Window:

    static int maxSumSlW(int[] arr, int k) {
        int curr = 0;
        int n = arr.length;
        for (int i = 0; i < k; i++) {
            curr = curr + arr[i];

        }
        int res = curr;
        for (int i = k; i < n; i++) {
            curr = curr + arr[i] - arr[i - k];
            res = Math.max(res, curr);


        }
        return res;
    }
}
