package com.sandip;

//Efficient Solution =>  (a*b)=gcd(a,b)*lcm(a,b);

public class lcmOptimize {
    public static void main(String[] args) {
        System.out.println(lcm(4, 8));
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
