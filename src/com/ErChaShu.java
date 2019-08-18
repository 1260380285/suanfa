package com;

/**
 * @author: yuanbing
 * @created time: 2019/8/18 12:11
 * @description:
 */

public class ErChaShu {

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
        //head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);
        head.left.right.right=new Node(8);
        System.out.print("前序遍历：");
        preOrderTraverse(head);
        System.out.println();
        System.out.print("中序遍历：");
        inOrderTraverse(head);
        System.out.println();
        System.out.print("后序遍历：");
        postOrderTraverse(head);
    }

    //前序遍历
    public static void preOrderTraverse(Node root) {
        if (root != null) {
            System.out.print(root.value + "  ");
            preOrderTraverse(root.left);
            preOrderTraverse(root.right);
        }
    }
    //中序遍历
    public static void inOrderTraverse(Node root) {
        if (root != null) {
            inOrderTraverse(root.left);
            System.out.print(root.value + "  ");
            inOrderTraverse(root.right);
        }
    }
    //后序遍历
    public static void postOrderTraverse(Node root) {
        if (root != null) {
            postOrderTraverse(root.left);
            postOrderTraverse(root.right);
            System.out.print(root.value + "  ");
        }
    }
}
