package com.duandoudou.linkedlist;

import com.duandoudou.linkedlist.entity.MyLinkedList;
import com.duandoudou.linkedlist.entity.Node;

/**
 * DataStructuresAndAlgorithms
 * Date: 2019/7/30
 * Time: 9:45
 *
 * @author duandoudou
 */
public class ReverseLinkedList {

    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();

        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);
        list.push(7);
        list.push(8);
        list.push(9);
        list.push(10);
        Node head = list.getHead();

        print(head);
        print(reverse(head));
    }


    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node prefix = null;
        Node temp = head;
        while (temp != null) {
            Node next = temp.next;
            temp.next = prefix;
            prefix = temp;
            temp = next;
        }
        return prefix;
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
