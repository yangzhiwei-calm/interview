package com.yang.algorithm;

import java.util.Arrays;

/**
 * 对于数组类型的
 */
public class HeapSort {
    private static int[] maxHeap;
    private static int[] minHeap;

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,2,5,7,8,9,3,2};
        buildMaxHeap(arr);
        System.out.println(Arrays.toString(arr));

    }



    public static void buildMaxHeap(int[] arr) {
        int len = arr.length;
        for (int i = len / 2; i >= 0; i--) {
            heapify(arr, i, len);
        }
    }

    public static void heapify(int[] arr, int index, int len) {
        int unAdjustIndex = index;
        int leftChildren = unAdjustIndex * 2 + 1;
        int rightChildren = unAdjustIndex * 2 + 2;

        while (leftChildren < len || rightChildren < len) {
            //找出两者中较大的一个
            int maxIndex = rightChildren < len ?
                    arr[rightChildren]  > arr[leftChildren] ?  rightChildren : leftChildren
                    : leftChildren;
            if (arr[maxIndex] > arr[unAdjustIndex]) {
                Util.swap(arr, unAdjustIndex, maxIndex);
                unAdjustIndex = maxIndex;
                leftChildren = unAdjustIndex * 2 + 1;
                rightChildren = unAdjustIndex * 2 + 2;
            } else {
                break;
            }

        }
    }



}
