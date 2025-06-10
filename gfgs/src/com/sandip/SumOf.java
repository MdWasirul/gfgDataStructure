package com.sandip;

public class SumOf {
    public static void main(String[] args) {
        int ans = Sumofnatural(3);
        System.out.println(ans);
    }

    static int Sumofnatural(int n) {

//        int n = 3;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
