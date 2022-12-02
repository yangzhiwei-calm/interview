package com.yang.algorithm.chapter01;

import java.util.Scanner;
import java.util.Stack;

public class Parentheses {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        System.out.println(isParentheses(input));
    }
    public static boolean isParentheses(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == ')') {
                if (stack.pop() == '(') {
                    continue;
                } else {
                    return false;
                }
            } else if (c == '}') {
                if (stack.pop() == '{') {
                    continue;
                } else {
                    return false;
                }
            } else if (c == ']') {
                if (stack.pop() == '[') {
                    continue;
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.size() == 0 ? true : false;
    }
}
