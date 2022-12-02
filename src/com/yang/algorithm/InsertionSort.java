package com.yang.algorithm;

import java.util.Arrays;

//插入排序是稳定排序
public class InsertionSort {
    public static void main(String[] args) {
        int[] insertSrc = new int[] {1,2,3,6,5,2,4,7,8,3,4};
        insertionSort(insertSrc);
        System.out.println(Arrays.toString(insertSrc));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                int index = i;
                do {
                    Util.swap(arr, index - 1 , index);
                    index--;
                } while (index >= 1 && arr[index] > arr[index-1]);
            }

        }
    }
}
