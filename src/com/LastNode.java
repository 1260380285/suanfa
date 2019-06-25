package com;

/**
 * @author: yuanbing
 * @created time: 2019/6/21 16:24
 * @description:
 */

public class LastNode {

    class Node {
        Node next = null;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node findNode(Node head, int k) {
        if (head == null) {
            return null;
        }
        Node P1 = head;
        //先走k步
        while (P1 != null && k-- > 0) {
            P1 = P1.next;
        }
        //k>head的长度，直接返回
        if (k > 0) {
            return null;
        }
        Node P2 = head;
        while (P1 != null) {
            P1 = P1.next;
            P2 = P2.next;
        }
        return P2;
    }
}
