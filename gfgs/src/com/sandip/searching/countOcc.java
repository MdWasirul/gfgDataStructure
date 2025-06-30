package com.sandip.searching;

import static com.sandip.searching.iOfFirstOccurence.firstOcc;
import static com.sandip.searching.iOfSecondOccurences.lastOccurrence;

public class countOcc {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 20, 30, 30};
        int target = 20;
        int[] arr2 = {10, 10, 10, 10, 10};
        int[] arr3 = {5, 8, 10};
//        int[]arr4={0,0,0,0,1,1,1,1,1};
//        System.out.println(countElOcc(arr, target));
        System.out.println(countOfOcc(arr,20));
//        System.out.println(countOfOcc(arr4,1));
    }

    //Naive Solution:
    static int countElOcc(int[] arr, int x) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    //O(log n)
   static int countOfOcc(int[] arr, int x) {
        int first = firstOcc(arr, x);
        if (first == -1) {
            return 0;
        } else {
            return (lastOccurrence(arr, x) - first + 1);
        }
    }


}
