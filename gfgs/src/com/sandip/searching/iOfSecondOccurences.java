package com.sandip.searching;

public class iOfSecondOccurences {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 20, 40, 40};
        int[] arr2 = {5, 8, 8, 10, 10};
        int[] arr3 = {8, 10, 10, 12};

//        int target = 20;
//        int ans = lastOcc(arr, target);
//        System.out.println(ans);
//        int[] arr4 = {5, 10, 10, 10, 10, 20, 20};
//        int n = arr4.length;
//        System.out.println(lastOcEl(arr4, 0, n - 1, 10, n));
        System.out.println(lastOccurrence(arr,20));
    }

    //Naive Approach:
    static int lastOcc(int[] arr, int x) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }

        }
        return -1;
    }

    //Recursive  Solution:
    static int lastOcEl(int[] arr, int start, int end, int x, int n) {
        if (start > end) return -1;
        int mid = (start + end) / 2;

        if (arr[mid] > x) {
            return lastOcEl(arr, start, mid - 1, x, n);
        } else if (arr[mid] < x) {
            return lastOcEl(arr, mid + 1, end, x, n);
        } else {
            if (mid == n - 1 || arr[mid] != arr[mid + 1]) {
                return mid;
            } else {
                return lastOcEl(arr, mid + 1, end, x, n);
//                start=mid+1;
            }
        }

    }

    // Iterative Binary Search:O(log n)
    static int lastOccurrence(int[] arr, int x) {
        int n = arr.length;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (arr[mid] > x) {
                end = mid - 1;
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                if (mid == n - 1 || arr[mid] != arr[mid + 1]) {
                    return mid;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
