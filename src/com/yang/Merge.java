package com.yang;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] A = {1,2,3};
        int[] B = {2,5,6};
        merge(A,B);
    }

    //A = [1,2,3]


    //B = [2,5,6]


    //输出: [1,2,2,3,5,6]



        //假设AB都是升序数组
        public static  void merge(int[] A,  int[] B) {
            // A B均为空， A B分别为空
            if (A == null && B == null) {
                System.out.println("[]");
                return;
            } else if (A == null || A.length == 0) {
                System.out.println(Arrays.toString(B));
                return;
            } else  if (B == null || B.length == 0) {
                System.out.println(Arrays.toString(A));
                return;
            }

            // A B均不为空
            int[] mergedArr = new int[A.length + B.length];
            int mergedIndex = 0;
            int indexA = 0;
            int indexB = 0;
            //merge A B，知道其中一个到尾部
            while (indexA < A.length && indexB < B.length) {
                if (A[indexA] < B[indexB]) {
                    mergedArr[mergedIndex++] = A[indexA++];
                } else {
                    mergedArr[mergedIndex++] = B[indexB++];
                }
            }

            //merge未处理完的 A 或 B
            while (indexA < A.length) {
                mergedArr[mergedIndex++] = A[indexA++];
            }
            while (indexB < B.length) {
                mergedArr[mergedIndex++] = B[indexB++];
            }

            System.out.println(Arrays.toString(mergedArr));
            return;
        }

}
