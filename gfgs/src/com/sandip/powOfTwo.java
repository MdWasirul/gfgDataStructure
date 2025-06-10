package com.sandip;

public class powOfTwo {
    public static void main(String[] args) {
//        boolean ans = isPow2(6);
//        System.out.println(ans);
        System.out.println(isPow2Efficient(4));
    }

    static boolean isPow2(int n) {
        if (n == 0) return false;
        while (n != 1) {
            if (n % 2 != 0) {
                return false;
            }
            n = n / 2;
        }
        return true;
    }

    //Efficient solution
    static boolean isPow2Efficient(int n) {
        if (n == 0) return false;
        return ((n & (n - 1)) == 0);

    }
}
