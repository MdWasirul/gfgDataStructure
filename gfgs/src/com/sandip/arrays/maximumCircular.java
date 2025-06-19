package com.sandip.arrays;

//maximum Circular SubArray Sum
/*
A simple approach is to consider every element as the beginning of the subArray,
 and calculate the maximum possible sum,
which includes both circular and linear subArrays starting from that element.

 */
public class maximumCircular {
    public static void main(String[] args) {
        int[] arr = {5, -2, 3, 4};
        System.out.println(maxCircularSum(arr));
    }

    static int maxCircularSum(int[] arr) {
        int res = arr[0];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int curr_max = arr[i];
            int curr_sum = arr[i];
            for (int j = 1; j < n; j++) {
                // Circular index
                int index = (i + j) % n;
                curr_sum = curr_sum + arr[index];
                curr_max = Math.max(curr_sum, curr_max);

            }
            res = Math.max(res, curr_max);
        }
        return res;
    }

    //Efficient Approach:Maximum Circular SubArray Sum = Total Sum - Minimum SubArray Sum.
}
