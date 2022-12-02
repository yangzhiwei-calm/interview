package com.yang.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution01 {
    public static void main(String[] args) {
        //System.out.println(parseInt("123"));

        TreeNode root = new TreeNode();
        root.val = 0;

        HashMap hashMap;


    }

    public static int parseInt(String number) {
        int len = number.length();
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += (number.charAt(len - 1 - i) - '0') * Math.pow(10,i);
        }
        return sum;
    }


    public static void levelPrint(List<TreeNode> treeNode) {
        if (treeNode == null || treeNode.size() == 0) {
            return;
        }
        List<TreeNode> nextLevelNodes = printAndAddChildTreeNode(treeNode);
        levelPrint(nextLevelNodes);
    }

    public static List<TreeNode> printAndAddChildTreeNode(List<TreeNode> treeNode) {
        List<TreeNode> nextLevelNodes = new ArrayList<>();

        treeNode.forEach(
                node -> {
                    System.out.print(node.val + " ");
                    if (node.left != null) {
                       nextLevelNodes.add(node.left);
                    }
                    if (node.right != null) {
                        nextLevelNodes.add(node.right);
                    }
                }
        );
        System.out.println();

        return nextLevelNodes;
    }
}
