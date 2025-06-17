package com.sandip.arrays;

public class maxSumSubArr {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -1, 2};
        System.out.println("Maximum Sum in Sub Array is : "+maxSum(arr));
    }


    static int maxSum(int[] arr) {
        int maxSum =0;
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                currSum = currSum + arr[j];
                maxSum = Math.max(currSum, maxSum);

            }

        }
        return maxSum;
    }
}
