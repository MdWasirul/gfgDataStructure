package com.sandip.Stacks;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancePar {
    public  static boolean isMatching(char a, char b) {
        return ((a == '(' && b == ')') ||
                (a == '{' && b == '}') ||
                (a == '[' && b == ']'));
    }
    //'[()]'

    public static boolean isBalanced(String str) {
        ArrayDeque<Character> s = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (x == '(' || x == '{' || x == '[') {
                s.push(x);
            } else {
                if (s.isEmpty() == true) {
                    return false;
                } else if (isMatching(s.peek(), x) == false) {
                    return false;

                } else {
                    s.pop();
                }
            }

        }
        return (s.isEmpty() == true);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with parentheses: ");

        // Check if there is any input available
        if (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            if (isBalanced(s)) {
                System.out.println("The parentheses in the string are balanced.");
            } else {
                System.out.println("The parentheses in the string are not balanced.");
            }

        }

    }
}