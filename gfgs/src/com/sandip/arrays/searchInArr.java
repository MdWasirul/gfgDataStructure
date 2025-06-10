package com.sandip.arrays;

public class searchInArr {
    public static void main(String[] args) {
        int[] arr = {20, 5, 7, 25};
        int ans = search(arr, 4, 9);
        System.out.println("Index of searched item  is :" + ans);
    }

    /*
    array=arr[]
    size=n
    search Item=x
     */
    static int search(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
