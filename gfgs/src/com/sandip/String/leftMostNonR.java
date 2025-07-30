package com.sandip.String;

public class leftMostNonR {
    public static void main(String[] args) {
        String s = "geeksforgeeks"; // 5
        String s1 = "abcabc"; // -1
        String s3 = "apple";
//        System.out.println(leftNonRepeat(s));
        System.out.println(NonRep(s3));
    }

    static int leftNonRepeat(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return i;
            }

        }

        return -1;
    }

    static final int CHAR = 256;

    static int NonRep(String s) {
        int n = s.length();
        int[] count = new int[CHAR];
        for (int i = 0; i < n; i++) {
            count[s.charAt(i)]++;

        }
        for (int i = 0; i < n; i++) {
            if (count[s.charAt(i)] == 1) {
                return i;
            }

        }
        return -1;
    }

}
