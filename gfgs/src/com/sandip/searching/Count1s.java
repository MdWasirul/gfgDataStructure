package com.sandip.searching;


//Count Ones in Binary Array

public class Count1s {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 1, 1};
        System.out.println(countOnes(arr));
        System.out.println(countOnesB(arr));
    }


    //Naive sol:
    static int countOnes(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                return n - i;
            }

        }
        return 0;
    }

    //Using Binary Search:
    static int countOnesB(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == 0) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid - 1] == 0) {       //arr[mid-1]!=arr[mid]
                    return n - mid;
                }else {
                    high=mid-1;
                }
            }
        }
        return 0;
    }
}
