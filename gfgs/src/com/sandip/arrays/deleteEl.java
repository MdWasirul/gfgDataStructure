package com.sandip.arrays;

public class deleteEl {
    public static void main(String[] args) {
        int arr1[] = {3, 8, 12, 5, 6};
        System.out.println(deleteElement(arr1, 5, 12));
    }

    //here,n=Size of arr, x=the element to be deleted.

    static int deleteElement(int arr[], int n, int x) {
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                break;
            }
        }
        if (i == n) return n;
        for (int j = i; j < n - 1; j++) {
            arr[j] = arr[j + 1];
        }
        return (n - 1);  //return one size less than  original size
    }
}
