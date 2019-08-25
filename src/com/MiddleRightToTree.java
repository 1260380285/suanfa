package com;

import java.util.HashMap;

/**
 * @author: yuanbing
 * @created time: 2019/8/21 22:27
 * @description:
 */

public class MiddleRightToTree {

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
        // int[] preOrderTree = {1, 2, 5, 8, 3, 6, 7};
        int[] middleOrderTree = {2, 5, 8, 1, 6, 3, 7};
        int[] rightOrderTree = {8, 5, 2, 6, 7, 3, 1};
        Node head = middleRight2Tree(middleOrderTree, rightOrderTree);
        preOrderTraverse(head);
    }

    public static void preOrderTraverse(Node root) {
        if (root != null) {
            System.out.print(root.value + "  ");
            preOrderTraverse(root.left);
            preOrderTraverse(root.right);
        }
    }

    public static Node middleRight2Tree(int[] middleOrderTree, int[] rightOrderTree) {
        if (middleOrderTree == null || rightOrderTree == null) {
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < middleOrderTree.length; i++) {
            map.put(middleOrderTree[i], i);
        }
        return calculateTree(0, middleOrderTree.length - 1,
                rightOrderTree, 0, rightOrderTree.length - 1, map);
    }

    public static Node calculateTree(int middleStartIndex, int middleEndIndex, int[] rightOrderTree,
                                     int rightStartIndex, int rightEndIndex,
                                     HashMap<Integer, Integer> map) {
        if (rightStartIndex > rightEndIndex) {
            return null;
        }
        Node head = new Node(rightOrderTree[rightEndIndex]);
        int index = map.get(rightOrderTree[rightEndIndex]);
        head.left = calculateTree(middleStartIndex, index - 1, rightOrderTree,
                rightStartIndex, rightStartIndex + index - middleStartIndex - 1, map);
        head.right = calculateTree(index + 1, middleEndIndex, rightOrderTree,
                rightStartIndex + index - middleStartIndex, rightEndIndex - 1, map);
        return head;
    }
}
