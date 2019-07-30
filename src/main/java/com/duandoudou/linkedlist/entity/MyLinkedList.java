package com.duandoudou.linkedlist.entity;

/**
 * DataStructuresAndAlgorithms
 * Date: 2019/7/30
 * Time: 9:46
 * 自定义链表以及链表的各种操作
 *
 * @author duandoudou
 */
public class MyLinkedList<T> {
    public Node head;

    /**
     * 数组长度
     */
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void push(T t) {
        Node node = new Node(t);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        size++;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(16);
        builder.append("MyLinkedList{");
        Node temp = head;
        while (temp != null) {
            builder.append(temp.value);
            temp = temp.next;
            if (temp != null) {
                builder.append(" -> ");
            }
        }
        builder.append("}");
        return builder.toString();
    }

    private class Node {
        T value;
        Node next;

        public Node(T value) {
            this.value = value;
        }
    }
}
