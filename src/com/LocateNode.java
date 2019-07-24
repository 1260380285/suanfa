package com;

/**
 * @author: yuanbing
 * @created time: 2019/7/24 23:45
 * @description:
 */

public class LocateNode {
    public static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void divide2List(Node head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        Node middle = head;
        Node right = head.next;
        //通过middle走一步，right走两步确定middle的位置
        while (right.next != null && right.next.next != null) {
            middle = middle.next;
            right = right.next.next;
        }
        right = middle.next;
        middle.next = null;
        location(head, right);
    }

    public static void location(Node left, Node right) {
        Node next;
        while (left.next != null) {
            //保留right的下一个节点
            next = right.next;
            //把left的下一个节点复制给right的下一个节点
            right.next = left.next;
            //把right节点复制给left的下一个节点
            left.next = right;
            //设置left的下一个节点
            left = right.next;
            //设置right的下一个节点
            right = next;
        }
        left.next = right;
    }

    public static void printList(Node head) {
        System.out.print("Linked List: ");
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = null;
        divide2List(head);
        printList(head);

        head = new Node(1);
        divide2List(head);
        printList(head);

        head = new Node(1);
        head.next = new Node(2);
        divide2List(head);
        printList(head);

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        divide2List(head);
        printList(head);

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        divide2List(head);
        printList(head);

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        divide2List(head);
        printList(head);

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        divide2List(head);
        printList(head);

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        divide2List(head);
        printList(head);

    }
}
