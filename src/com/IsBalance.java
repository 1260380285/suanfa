package com;

/**
 * @author: yuanbing
 * @created time: 2019/8/18 15:11
 * @description:
 */

public class IsBalance {

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);
        head.left.right.right=new Node(8);
        System.out.println(isBalance(head));
    }

    public static boolean isBalance(Node head) {
        boolean[] res = new boolean[1];
        res[0] = true;
        getHeight(head, 1, res);
        return res[0];
    }

    public static int getHeight(Node head, int level, boolean[] res) {
        if (head == null) {
            return level;
        }
        System.out.println("left:"+head.value);
        int leftHeight = getHeight(head.left, level + 1, res);
        if (!res[0]) {
            return level;
        }
        System.out.println("right:"+head.value);
        int rightHeight = getHeight(head.right, level + 1, res);
        if (!res[0]) {
            return level;
        }
        if (Math.abs(leftHeight - rightHeight) > 1) {
            res[0] = false;
        }
        return Math.max(leftHeight, rightHeight);
    }

}
