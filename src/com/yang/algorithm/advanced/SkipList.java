package com.yang.algorithm.advanced;

import java.util.Random;

public class SkipList {
    /**
     * 只能用于元素有序的情况 1989年出现
     * skip list 对标的是 AVL平衡树 和 二分查找
     * 它的优势是原理简单，容易实现，方便扩展，效率更高
     */

    SkipNode headNode;//头节点，入口
    int highLevel;//当前跳表索引层数
    Random random;// 用于投掷硬币
    final int MAX_LEVEL = 32;//最大的层

    SkipList(){
        random=new Random();
        headNode=new SkipNode(Integer.MIN_VALUE,null);
        highLevel=0;
    }


    public SkipNode search(int key) {
        return null;

    }
















    public static void main(String[] args) {

    }


}
