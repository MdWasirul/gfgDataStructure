package com.sandip;

public class Count {
    public static void main(String[] args) {
        int n = 103456;
        System.out.println(CountDigits(n));


    }

    static int CountDigits(int n) {
        int res = 0;
        if(n==0) return -1;

        while (n > 0) {
            n = n / 10;
            res++;
        }
        return res;
    }
}
