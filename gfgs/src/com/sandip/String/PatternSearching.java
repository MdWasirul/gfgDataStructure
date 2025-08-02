package com.sandip.String;

// return the index of text where the pattern matching the text;
public class PatternSearching {
    public static void main(String[] args) {
        String txt = "ABABABCD";
        String pat = "ABAB";
        patternFind(txt, pat);
    }

    static void patternFind(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (pat.charAt(j) != txt.charAt(i + j)) {
                    break;
                }


            }
            if (j == m) {
                System.out.println(i + " ");
            }

        }
    }

}
