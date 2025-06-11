package com.sandip.arrays;

//find Second -Largest Element in Array
public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {5, 20, 12, 20, 10};
//        System.out.println(secondLargestEl(arr));
        System.out.println("Index is : " + secondLargest(arr));
    }


    static int secondLargestEl(int[] arr) {
        int largest = getLargest(arr);
        int n = arr.length;
        int res = -1; //return index of second largest.
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[largest]) {
                if (res == -1) {
                    res = i;
                } else if (arr[i] > arr[res]) {
                    res = i;
                }
            }
        }
        return res;   //also return value arr[res]=12 at i=2;
    }

    static int getLargest(int arr[]) {
        int largest = 0;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[largest]) {
                largest = i;
            }
        }
        return largest;
    }

    //Efficient Approach
    static int secondLargest(int arr[]) {
        int res = -1;
        int largest = 0;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[largest]) {
                res = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if (res == -1 || arr[i] > arr[res]) {
                    res = i;
                }
            }
        }
        return res;
    }
}
