package com.duandoudou.linkedlist;

import com.duandoudou.linkedlist.entity.MyLinkedList;
import com.duandoudou.linkedlist.entity.Node;

public class CountdownKNode {
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

        System.out.println(getCountdownValue(head, 11));
    }


    public static int getCountdownValue(Node head, int k) {
        if (head == null) {
            throw new RuntimeException("链表为空");
        }
        if(k < 1){
            throw new RuntimeException("索引有误");
        }
        Node first = head;
        Node last = head;

        while (last != null) {
            last = last.next;
            if (k > 0) {
                k--;
            } else {
                first = first.next;
            }
        }
        return (Integer) first.value;
    }
}
