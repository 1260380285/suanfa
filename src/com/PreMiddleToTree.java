package com;

import java.util.HashMap;

/**
 * @author: yuanbing
 * @created time: 2019/8/21 22:27
 * @description:
 */

public class PreMiddleToTree {

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }

    public static void main(String[] args) {
        //前序遍历：1  2  5  8  3  6  7
        //中序遍历：2  5  8  1  6  3  7
        //后序遍历：8  5  2  6  7  3  1
        int[] preOrderTree = {1, 2, 5, 8, 3, 6, 7};
        int[] middleOrderTree = {2, 5, 8, 1, 6, 3, 7};
        calculateTree(preOrderTree, middleOrderTree);
    }


    public static Node calculateTree(int[] preOrderTree, int[] middleOrderTree) {
        if (preOrderTree == null || middleOrderTree == null) {
            return null;
        }
        HashMap<Integer, Integer> middleOrderMap = new HashMap<>();
        for (int i = 0; i < middleOrderTree.length; i++) {
            middleOrderMap.put(middleOrderTree[i], i);
        }
        return calculateTree(preOrderTree, 0, preOrderTree.length - 1,
                0, middleOrderTree.length - 1, middleOrderMap);
    }

    public static Node calculateTree(int[] preOrderTree, int preStartIndex, int preEndIndex, int middleStartIndex, int middleEndIndex,
                                     HashMap<Integer, Integer> middleOrderMap) {
        if (preStartIndex > preEndIndex) {
            return null;
        }
        System.out.println("  p[preStartIndex]:" + preOrderTree[preStartIndex] + "  preStartIndex:" + preStartIndex
                + "  preEndIndex:" + preEndIndex + "  middleStartIndex:" + middleStartIndex + "  middleEndIndex:" + middleEndIndex);
        Node head = new Node(preOrderTree[preStartIndex]);
        int headIndexInMiddle = middleOrderMap.get(preOrderTree[preStartIndex]);
        //前序遍历和中序遍历的左半部分
        head.left = calculateTree(preOrderTree, preStartIndex + 1, preStartIndex + headIndexInMiddle - middleStartIndex,
                middleStartIndex, headIndexInMiddle - 1, middleOrderMap);
        //前序遍历和中序遍历的右半部分
        head.right = calculateTree(preOrderTree, preStartIndex + headIndexInMiddle - middleStartIndex + 1,
                preEndIndex, headIndexInMiddle + 1, middleEndIndex, middleOrderMap);
        return head;
    }
}
