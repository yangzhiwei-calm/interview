package com.yang.algorithm.hw.interview;

import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        if (input == null || input.length() == 0) {
            return;
        }

        char[] inputArr = input.toCharArray();
        char[] collectedArr = new char[inputArr.length];
        int start = 0;
        for (int i = 0; i < input.length(); i++) {
            if (isBorder(inputArr[i])) {
                insertReverseWord(inputArr, collectedArr, start, i - 1);
                //处理多个border字符相邻的情况
                while(i < inputArr.length && isBorder(inputArr[i])) {
                    collectedArr[i]=inputArr[i];
                    i++;
                }
                start = i;
            }
        }
        insertReverseWord(inputArr, collectedArr, start, inputArr.length - 1);
        //处理多个border字符相邻的情况

        System.out.println(new String(collectedArr));
    }
    public static boolean isBorder(char c) {
        if (c == ',' || c == '.' || c == '?' || c == ' ') {
            return true;
        }

        return false;
    }

    public static void insertReverseWord(char[] charArr, char[] collectedArr, int l, int r) {
        int index = l;
        for (; r >= l; r--) {
           collectedArr[index++] = charArr[r];
        }
    }
}
