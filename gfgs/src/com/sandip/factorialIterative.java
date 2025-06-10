package com.sandip;
//Factorial by iterative model
//This model is better than recursive model
public class factorialIterative {
    public static void main(String[] args) {
        int x = 3;
        System.out.println(fact(x));

    }

    static int fact(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res = res * i;

        }
        return (res);
    }
}
