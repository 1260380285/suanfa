package com;

/**
 * @author: yuanbing
 * @created time: 2019/7/19 00:38
 * @description:
 */

public class RemoveNode {
    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }

    public static Node removeMiddleNode(Node head) {
        //没有头节点或只有一个节点的时候
        if (head == null || head.next == null) {
            return head;
        }
        //两个节点的时候
        if (head.next.next == null) {
            return head.next;
        }
        //大于2个节点的时候
        Node first = head;
        Node second = head.next.next;
        while (second.next != null && second.next.next != null) {
            //first移动1步，second移动2步
            first = first.next;
            second = second.next.next;
        }
        first.next = first.next.next;
        return head;
    }

    public static Node removeNodeByRatio(Node head, int a, int b) {
        if (a < 1 || a > b) {
            return head;
        }
        int count = 0;
        Node current = head;
        //获取链表总的长度count
        while (current != null) {
            count++;
            current = current.next;
        }
        //当前需要移除的位置
        count = (int) Math.ceil(((double) (a * count)) / (double) b);
        //需要移除的是第一个
        if (count == 1) {
            head = head.next;
        }
        if (count > 1) {
            current = head;
            //从头开始遍历
            while (--count != 1) {
                current = current.next;
            }
            //移除当前节点
            current.next = current.next.next;
        }
        return head;
    }

    public static void printLinkedList(Node head) {
        System.out.print("Linked List: ");
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        printLinkedList(head);
        head = removeMiddleNode(head);
        printLinkedList(head);
        head = removeNodeByRatio(head, 2, 5);
        printLinkedList(head);
        head = removeNodeByRatio(head, 1, 3);
        printLinkedList(head);

    }
}
