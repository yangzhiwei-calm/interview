package com.yang.algorithm;

import java.util.Arrays;

/**
 *选择排序是不稳定排序，它的不稳定主要来自选择好之后的 交换步骤
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] selectionSortSrc = new int[]{1,3,2,5,7,3,9};
        selectionSort(selectionSortSrc);
        System.out.println(Arrays.toString(selectionSortSrc));

    }
    public static void selectionSort(int[] arr) {
        for (int i =0; i < arr.length -1; i++) {
            int maxIndex = 0;
            //到当前这一位为止的最大的数与末尾位置交换
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[maxIndex] < arr[j]) {
                    maxIndex = j;
                }
            }
            Util.swap(arr, maxIndex, arr.length - i - 1);
        }
    }

}
