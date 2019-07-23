package com;

/**
 * @author: yuanbing
 * @created time: 2019/7/24 07:49
 * @description:
 */

class RemoveNode1 {
    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }

    public static void removeNodeUnNormal(Node node) {
        if (node == null) {
            return;
        }
        Node next = node.next;
        if (next == null) {
            throw new RuntimeException("can not remove last node.");
        }
        node.value = next.value;
        node.next = next.next;
    }

    public static void printCurrentLinkedList(Node head) {
        System.out.print("Current Linked List: ");
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
        Node node = head;
        printCurrentLinkedList(head);
        removeNodeUnNormal(node);
        printCurrentLinkedList(head);

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        node = head.next;
        printCurrentLinkedList(head);
        removeNodeUnNormal(node);
        printCurrentLinkedList(head);

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        node = head.next.next;
        printCurrentLinkedList(head);
        removeNodeUnNormal(node);
        printCurrentLinkedList(head);

    }
}
