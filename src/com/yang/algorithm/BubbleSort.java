package com.yang.algorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] bubbleSrc = new int[]{1,2,5,4,6,8,2};
        bubbleSortASC(bubbleSrc);
        System.out.println(Arrays.toString(bubbleSrc));
        bubbleSortDESC(bubbleSrc);
        System.out.println(Arrays.toString(bubbleSrc));
    }


    //bubbleSort的稳定性体现在 只有大于的时候才会交换
    public static void bubbleSortASC(int[] arr) {
        //第一层作为计数器
        for (int i = 0; i < arr.length; i++) {
            //第一层的计数器正好可以减少第二层的比较次数
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

//    public void heapSort(int[] arr) {
//        int s
//        for ()
//    }

    public static void bubbleSortDESC(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j+1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }




}
