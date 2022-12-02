package com.yang.algorithm;

//查找算法
public class BinarySearch {
    public static void main(String[] args) {
        int[] binarySrc = new int[]{1,2,3,3,4,5,6,7,8};
        System.out.println(binarySearch(binarySrc, 0 , binarySrc.length - 1, 3));
    }

    // 如果区间范围分割gap 大于0，就会出现 l > r
    public static int binarySearch(int[] arr, int l, int r, int target) {
        if (l > r) {
            return  -1;
        } else if (l == r) {
            return arr[l] == target ? l : -1;
        } else {
            int mid = l + (r - l) /2;
            if (arr[mid] == target) {
                return mid;
            }

            int leftIndex =  binarySearch(arr, l, mid - 1, target);
            int rightIndex = binarySearch(arr, mid + 1, r, target);
            return leftIndex != -1 ? leftIndex : rightIndex ;
        }


    }
}
