package com.duandoudou.linkedlist;

/**
 * DataStructuresAndAlgorithms
 * Date: 2019/7/30
 * Time: 9:45
 *
 * @author duandoudou
 */
public class ReverseLinkedList {


    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;
        node7.next=node8;
        node8.next=node9;
        node9.next=node10;

        print(node1);
        print(reverse(node1));
    }


    public static Node reverse(Node head) {
        if(head == null || head.next == null){
            return head;
        }

        Node prefix = null;
        Node temp = head;
        while(temp != null){
            Node next = temp.next;
            temp.next = prefix;
            prefix = temp;
            temp = next;
        }
        return prefix;
    }

    private static class Node<T> {
        T value;
        Node next;

        Node(T value) {
            this.value = value;
        }
    }

    private static void print(Node head) {
        StringBuilder builder = new StringBuilder(16);
        Node temp = head;
        while (temp != null) {
            builder.append(temp.value);
            temp = temp.next;
            if (temp != null) {
                builder.append(" -> ");
            }
        }
        System.out.println(builder);
    }
}
