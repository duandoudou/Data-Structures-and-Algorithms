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
    private Node head;

    /**
     * 数组长度
     */
    private int size;

    public int getSize() {
        return size;
    }

    /**
     * 添加元素到链表尾部
     *
     * @param t 元素值
     */
    public void push(T t) {
        Node node = new Node<T>(t);
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

    /**
     * 插入元素到指定索引处
     *
     * @param t     元素值
     * @param index 索引
     */
    public void insert(T t, int index) {
        if (index < 0 || index > size) {
            throw new RuntimeException("索引有误！");
        }
        Node node = new Node<T>(t);
        if (index == 0) {
            node.next = head;
            head = node;
            return;
        }

        int i = 0;
        Node temp = head;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        Node next = temp.next;
        temp.next = node;
        node.next = next;
        size++;
    }

    /**
     * 从链表头部取出节点
     *
     * @return T
     */
    public T get() {
        if (head == null) {
            return null;
        }
        return (T) head.value;
    }

    /**
     * 从指定索引取出元素
     *
     * @param index 索引
     * @return T
     */
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException("索引有误！");
        }

        int i = 0;
        Node temp = head;
        while (i < index) {
            temp = temp.next;
            i++;
        }
        return (T) temp.value;
    }

    /**
     * 从链表头部取出节点，并且删除头部元素
     *
     * @return T
     */
    public T pop() {
        if (head == null) {
            return null;
        }
        Node node = head;
        head = head.next;
        size--;
        return (T) node.value;
    }

    /**
     * 从链表指定索引处删除元素，并且返回该节点的值
     *
     * @return T
     */
    public T delete(int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException("索引有误！");
        }

        int i = 0;
        Node temp = head;
        if (index == 0) {
            head = head.next;
            return (T) temp.value;
        }
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        Node next = temp.next;
        temp.next = next.next;
        size--;
        return (T) next.value;
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

    public Node getHead() {
        return head;
    }
}
