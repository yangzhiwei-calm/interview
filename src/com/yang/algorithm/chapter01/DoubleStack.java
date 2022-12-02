package com.yang.algorithm.chapter01;

import java.util.Scanner;
import java.util.Stack;

//每一层都是两个元素，这是一种比较简化的抽象
public class DoubleStack {
    private static Stack<Character> operatorStack;
    private static Stack<Double> numStack;

    public DoubleStack() {
        operatorStack = new Stack<>();
        numStack = new Stack<>();
    }
    public  Double calculate(String expression) {
        for (char c : expression.toCharArray()) {
            if (c == '(' || c == ' ') {
                continue;
            } else if (c == ')') {
                Double  tempRes = doCalculate(numStack.pop(), numStack.pop(), operatorStack.pop());
                numStack.push(tempRes);
            } else {
                if (isNumberic(c)) {
                    numStack.push((double)(int)(c - '0'));
                } else {
                    operatorStack.push(c);
                }

            }

        }

        return numStack.pop();
    }

    public  double doCalculate(Double num1, Double num2, char operator) {
        if (operator == '+') {
            return num1 + num2;
        } else if (operator == '-') {
            return num2 - num1;
        } else if (operator == '*') {
            return num1 * num2;
        } else {
           return  num2 / num1;
        }
    }

    public boolean isNumberic(char c) {
        if ('0' <= c && c <= '9') {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
       DoubleStack doubleStack = new DoubleStack();
       int[] arr = new int[-1];
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            System.out.println(doubleStack.calculate(in.nextLine()));
        }
    }


}
