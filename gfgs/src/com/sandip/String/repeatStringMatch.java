package com.sandip.String;

public class repeatStringMatch {

    public static void main(String[] args) {
        String a = "abcd";
        String b = "cdabcdab";
        System.out.println(repeatedStringMatch(a,b));
    }

    static int repeatedStringMatch(String a, String b) {
//        StringBuilder str = new StringBuilder();
//        int count = 0;
//        while (true) {
//
//        }
//        if (!validate(A, B)) return -1;
//        int count = 0;
//        StringBuffer sb = new StringBuffer();
//        while (sb.length() < B.length()) {
//            count++;
//            sb.append(A);
//        }
//        if (sb.indexOf(B) != -1) return count;
//        if (sb.append(A).indexOf(B) != -1) return count + 1;
//        return -1;

        StringBuilder repeated=new StringBuilder();
        int count=0; 
        while(repeated.length()<b.length()){
            repeated.append(a);
            count++;
        }
        if(repeated.toString().contains(b)){
            return count;
        }
        repeated.append(a);
        count++;
        if(repeated.toString().contains(b)){
            return count;
        }
        return -1;

    }

//    }
//
//    static boolean validate(String A, String B) {
//        boolean[] checkA = new boolean[256];
//        boolean[] checkB = new boolean[256];
//
//        for (char c : A.toCharArray()) {
//            checkA[c] = true;
//        }
//        for (char c : B.toCharArray()) {
//            checkB[c] = true;
//        }
//        for (int i = 0; i < 256; i++) {
//            if (checkB[i] && !checkA[i]) {
//                return false;
//            }
//        }
//        return true;
//    }

}
