package com.yang.algorithm.hw.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lineNum = Integer.valueOf(in.nextLine());
        int index = 0;
        Map<String,Integer> numberIndex = new HashMap();
        int maxDistance = -1;
        while (index < lineNum) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String input = in.nextLine();
            if (!numberIndex.containsKey(input)) {
                numberIndex.put(input, index);
            } else {
                maxDistance = index - numberIndex.get(input) > maxDistance ? index - numberIndex.get(input) : maxDistance;
            }
            index++;
        }
        System.out.println(maxDistance);
    }
}
