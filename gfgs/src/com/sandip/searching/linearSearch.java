package com.sandip.searching;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
//        int target=20;
//        int ans = naiveSol(arr, 20);
//        System.out.println("Index: " + ans);
        System.out.println(binarySearch(arr, 20));
    }
    //Naive Solution:Linear Search (suppose array is not sorted)

//    static int naiveSol(int[] arr, int x) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == x) {
//                return i;
//            }
//        }
//        return -1;
//    }

    // Suppose Array is Sorted--Binary Search
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
//        int mid=(start+end)/2;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }

        }
        return -1;

    }
}
