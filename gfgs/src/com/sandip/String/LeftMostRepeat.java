package com.sandip.String;

public class LeftMostRepeat {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        String s1 = "abbccc";
        String s2 = "abcd";
//        System.out.println(leftMostIndex("abcd"));
//        System.out.println(leftMost(s));
        System.out.println(leftMostR(s));
    }

    //Naive
    static int leftMostIndex(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return i;
                }

            }

        }
        return -1;
    }

    //    Better Approach
    static final int CHAR = 256;

    static int leftMost(String s) {
        int[] count = new int[CHAR];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;

        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] > 1) {
                return i;
            }


        }
        return -1;

    }

    //Efficient approach 2;
    //    static final int CHAR=256;
    static int leftMostR(String s) {
        boolean[] visited = new boolean[CHAR];
        int res = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (visited[s.charAt(i)]) {
                res = i;
            } else {
                visited[s.charAt(i)] = true;
            }

        }
        return res;
    }
}
