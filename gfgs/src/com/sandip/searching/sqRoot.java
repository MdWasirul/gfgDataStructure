package com.sandip.searching;

public class sqRoot {
    public static void main(String[] args) {
//        int x = 5;
//        int ans = sqRootFloor(15);
//        System.out.println(ans);
        System.out.println(squareRootFloor(4));
    }

    //Naive Sol: O(root x)
    static int sqRootFloor(int x) {
        int i = 1;
        while (i * i <= x) {
            i++;
        }
        return i - 1;
    }

    //Efficient sol: O(log n)
    static int squareRootFloor(int x) {
        int low = 1;
        int high = x;
        int ans = 0;
        if (x == 0 || x == 1) {
            return x;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int mSq = mid * mid;
            if (mSq == x) {
                return mid;

            } else if (mSq > x) {
                high = mid - 1;


            } else {
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    // To avoid overflow, compare using division
    //instead of multiplication
//            if (mid <= x / mid) {
//        ans = mid;
//        low = mid + 1;
//    } else {
//        high = mid - 1;
//    }
}
