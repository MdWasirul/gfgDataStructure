package com.sandip;

public class Defanging {
    public static void main(String[] args) {
        String str = "1.1.1.1";
        String str2 = "255.100.50.0";
        System.out.println(defangIPaddr(str));
    }

    static String defangIPaddr(String address) {
//       return address.replace(".","[.]");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (c == '.') {
                sb.append("[.]");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
