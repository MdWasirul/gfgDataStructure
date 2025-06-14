package com.sandip.arrays;
/* An element is a Leader if it is greater than or equal to all the elements to its right side.

Note: The rightmost element is always a leader.*/


import java.util.Arrays;

public class leaderEl {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 10, 6, 5, 2};
        //        leadersElArr(arr);
        //        System.out.println(Arrays.toString(arr));
        //--Method:2
        leadersMethod2(arr);

    }

    static void leadersElArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    flag = true;
                    break;
                }

            }
            if (flag == false) {
                System.out.print(arr[i] + "\t");
            }
        }
    }

    //    int[] arr = {7, 10, 4, 10, 6, 5, 2};
    //    Note: The rightmost element is always a leader.
    static void leadersMethod2(int[] arr) {
        int n = arr.length;
        int current_leader = arr[n - 1];
        System.out.print(current_leader + "\t");
        for (int i = n - 2; i >= 0; i--) {
            if (current_leader < arr[i]) {
                current_leader = arr[i];
                System.out.print(current_leader + "\t");
            }

        }

    }

}
