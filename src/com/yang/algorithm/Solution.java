package com.yang.algorithm;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,2,3};
        quickSort(arr ,0 ,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(arr, left, right);
            quickSort(arr, left, partitionIndex -1);
            quickSort(arr, right, partitionIndex + 1);
        }

    }

    public static int partition(int[] arr, int left, int right) {
        int cursor = left;
        while (cursor < right) {
            if (arr[cursor] <= arr[right]) {
                swap(arr, left++, cursor++);
            } else {
                cursor++;
            }
        }
        swap(arr, left, cursor);

        return left;
    }

    public static void swap(int[] arr,int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

}
