package com.sandip.String;

import java.lang.*;

public class subsequence {
    public static void main(String[] args) {
        String s1 = "GEEKSFORGEEKS";
        String s2 = "GRGES";
        System.out.println(isSubSeq(s1, s2));
    }

    static boolean isSubSeq(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if (n < m) return false;
        int j = 0;
        for (int i = 0; i < n && j < m; i++) {
            if (s1.charAt(i) == s2.charAt(j)) {
                j++;
            }
        }
        return (j == m);
    }
}
