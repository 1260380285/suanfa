package com;

/**
 * @author: yuanbing
 * @created time: 2019/6/16 20:07
 * @description:
 */

public class ReverseNode {
    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node reversePart(Node head, int from, int to) {
        int count = 0;
        //代表to位置节点的后一个节点
        Node toNext = null;
        //代表from位置节点的前一个节点
        Node fromPrev = null;
        Node cur = head;

        while (cur != null) {
            count++;
            fromPrev = count == from - 1 ? cur : fromPrev;
            toNext = count == to + 1 ? cur : toNext;
            cur = cur.next;
        }

        if (from > to || from < 1 || to > count) {
            return head;
        }

        cur = fromPrev == null ? head : fromPrev.next;
        Node prev = toNext;
        Node next;
        while (cur != toNext) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        //头结点不用反转的情况，将不用反转的链表和已经反转好的链表进行连接
        if (fromPrev != null) {
            fromPrev.next = prev;
            return head;
        }
        //头结点需要反转的情况，返回新的头结点
        return prev;
    }
}
