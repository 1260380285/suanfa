package com;

import java.util.HashSet;

/**
 * @author: yuanbing
 * @created time: 2019/9/1 16:50
 * @description:
 */

public class RemoveRepeatNode {
    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }

    public static void removeRepeatNode(Node head) {
        if (head == null) {
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        Node pre = head;
        Node current = head.next;
        set.add(head.value);
        while (current != null) {
            if (set.contains(current.value)) {
                pre.next = current.next;
            } else {
                set.add(current.value);
                pre = current;
            }
            current = current.next;
        }
    }

    public static void removeRepeatNode2(Node head) {
        Node current = head;
        Node pre;
        Node next;
        while (current != null) {
            pre = current;
            next = current.next;
            while (next != null) {
                if (current.value == next.value) {
                    pre.next = next.next;
                } else {
                    pre = next;
                }
                next = next.next;
            }
            current = current.next;
        }
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
       // String s=Integer.toBinaryString(-12);
        //System.out.print(s);
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next.next = new Node(3);
        removeRepeatNode(head);
        printLinkedList(head);

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next.next = new Node(3);
        removeRepeatNode2(head);
        printLinkedList(head);

    }
}
