package com.sandip;

public class factorialRecursive {
    public static void main(String[] args) {
//        int n = 5;
        System.out.println("factorial of a n is :" + fact(6));
    }

    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
