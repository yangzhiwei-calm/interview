package com.yang.algorithm.advanced;

public class SkipNode<T>
{
    int key;
    T value;
    SkipNode right,down;//右下个方向的指针
    public SkipNode (int key,T value) {
        this.key=key;
        this.value=value;
    }
}