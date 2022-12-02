package com.yang.algorithm.hw;

import java.util.Scanner;

public class HJ02 {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            // 注意 hasNext 和 hasNextLine 的区别
            int lineNum = 1;
            int table[] = new int[128];
            while (in.hasNextLine()) { // 注意 while 处理多个 case
                String input = in.nextLine();
                if (lineNum == 1) {
                    for (char curChar : input.toCharArray()) {
                        table[(int)curChar]++;
                    }
                    lineNum++;
                } else if (lineNum == 2) {
                    char specifiedChar = input.charAt(0);
                    int num = 0;
                    if (('A' <= specifiedChar && specifiedChar <= 'Z')) {
                        num = table[(int)specifiedChar] + table[(int)specifiedChar + 32];
                    } else if(('a' <= specifiedChar && specifiedChar <= 'z')) {
                        num = table[(int)specifiedChar] + table[(int)specifiedChar - 32];
                    }
                    else {
                        num = table[(int)specifiedChar];
                    }


                    System.out.println(num);
                    return;

                    //String aa;
                    //aa.substring(aa.)
                }

            }

        }
}
