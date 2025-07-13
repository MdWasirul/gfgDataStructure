package com.sandip.Recursion;

//Let's see how function Call takes place......

public class funCall {
//    public static void main(String[] args) {
//        System.out.println("Before Fun2");
//        fun2();
//        System.out.println("After Fun2");
//    }
//
//    static void fun1() {
//        System.out.println("Fun1");
//    }
//
//    static void fun2() {
//        System.out.println("Before Fun1");
//        fun1();
//        System.out.println("After Fun1");
//    }

    /*
    Before Fun2
    Before Fun1
      Fun1
    After Fun1
    After Fun2

     */
    public static void main(String[] args) {
//        int ans = fun(16);
//        System.out.println(ans);

//        fun2(13);
//          printN(100);
        System.out.print(fact(4));
        System.out.println("\n");
        System.out.println(fib(4));
    }

    static int fun(int n) {
        if (n == 1) {
            return 0;
        } else {
            return 1 + fun(n / 2);
        }
    }

    static void fun2(int n) {
        if (n == 0) return;
        fun2(n / 2);
        System.out.print(n % 2 + " ");
    }

    //print N to 1 AND print 1 to N.
    static void printN(int n) {
        //-----N to 1
        if (n == 0) return;
        System.out.println(n);
        printN(n - 1);
        //----- 1 to N-----
//        if(n==0) return;
//        printN(n-1);
//        System.out.println(n);
    }

    //Factorial using Recursion
    static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    //Fibonacci of Number
    static int fib(int n) {
        //two base Case required....
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fib(n - 1) + fib(n - 2);
    }

}
