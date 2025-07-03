package com.sandip.searching;

//Search target  element  in a sorted rotated Array

public class searchRotated {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 8, 9};
        int target = 30;
        System.out.println(search(arr, 30));
        System.out.println(searchInRotatedSorted(arr, 3));
    }

    // Naive solution
    static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return -1;
    }

    //    int[] arr = {10, 20, 30, 40, 50, 60, 8, 9};
    //Binary search:
    static int searchInRotatedSorted(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[low] <= arr[mid]) {
                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            } else {
                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

}
