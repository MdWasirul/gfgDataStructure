package com.sandip.arrays;

//Remove Duplicate from Array and generate  distinct elements.
public class removeDuplecateArr {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 30, 30};
//        System.out.println(removeDuplicateEl(arr));

        System.out.println(remDups(arr));
    }

    static int removeDuplicateEl(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        temp[0] = arr[0];   //temp={10,}
        int res = 1;  //orinalElCount=1.

        for (int i = 1; i < n; i++) {
            if (temp[res - 1] != arr[i]) {
                temp[res] = arr[i];
                res++;
            }
        }
        for (int i = 0; i < res; i++) {
            arr[i] = temp[i];
        }
        return res;
    }

    // efficient approach that takes O(n)Time and O(1) Aux Space.
    //    int[] arr = {10, 20, 20, 30, 30, 30};
    static int remDups(int[] arr) {
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }

        }
        return res;
    }

}
