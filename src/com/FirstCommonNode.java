package com;

/**
 * @author: yuanbing
 * @created time: 2019/6/23 16:15
 * @description:
 */

public class FirstCommonNode {

    public static void main(String[] args) {
        //构造链表结构测试用
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        //第一个List
        a.next = b;
        b.next = c;
        c.next = f;
        f.next = g;
        //第二个List
        d.next = e;
        e.next = f;
        f.next = g;
        Node node = findFirstCommonNode(a, d);
        System.out.println(node.data);
    }

    static class Node {
        Node next = null;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node findFirstCommonNode(Node firstNode, Node secondNode) {
        int firstNodeCount = 0;
        int secondNodeCount = 0;
        Node commonNode = null;
        Node tempFirstNode = firstNode;
        Node secondFirstNode = secondNode;
        //得到链表1的长度
        while (tempFirstNode != null) {
            firstNodeCount++;
            tempFirstNode = tempFirstNode.next;
        }
        //得到链表2的长度
        while (secondFirstNode != null) {
            secondNodeCount++;
            secondFirstNode = secondFirstNode.next;
        }
        //令pNode1和pNode2重新指向头结点
        tempFirstNode = firstNode;
        secondFirstNode = secondNode;
        int differNum = firstNodeCount - secondNodeCount;
        if (differNum > 0) {
            for (int i = 0; i < differNum; i++) {
                tempFirstNode = tempFirstNode.next;
            }
        } else {
            for (int i = 0; i < Math.abs(differNum); i++) {
                secondFirstNode = secondFirstNode.next;
            }
        }
        //得到第一个公共节点
        while (tempFirstNode != null && secondFirstNode != null) {
            if (tempFirstNode != secondFirstNode) {
                tempFirstNode = tempFirstNode.next;
                secondFirstNode = secondFirstNode.next;
            } else {
                commonNode = tempFirstNode;
                return commonNode;
            }
        }
        return commonNode;
    }
}
