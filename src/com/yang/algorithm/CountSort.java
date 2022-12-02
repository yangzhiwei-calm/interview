package com.yang.algorithm;

import java.util.Arrays;

/**
 * 计数排序，给定的值是n 个 0 到 k 之间的整数时.
 * 其实只要是 整数区间就行，可以数值大小可以做映射。
 */
public class CountSort {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 3, 4,5,4,5,6,3,2,9};
        countSort(arr,9,0);
        System.out.println(Arrays.toString(arr));
    }

    /**
     *
     * @param arr
     * @param max
     * @param baseLine 基准线调整，默认为0
     */
    public static void countSort(int[] arr,int max, int baseLine) {
        int[] countArr = new int[max + 1];
        for (int i : arr) {
            countArr[i]++;
        }
        int index = 0;
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] != 0) {
                do {
                    arr[index++] = i;
                    countArr[i]--;
                } while (countArr[i] > 0);
            }
        }
    }

}
