package com.bridgelabz;

public class LinkedList<T> {
    Node<T> head;


    /**
     * Appends elements at the end of the list
     *
     * @param data elements passed
     */
    public void add(T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;
        if (head == null) {
            head = newNode;
        } else {
            Node<T> node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
    }

    /**
     * Appends elements at the start of list
     *
     * @param data elements passed
     */
    public void addAtStart(T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    /**
     * Used to insert elements at a particular index
     *
     * @param index
     * @param data  elements passed
     */
    public void add(int index, T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;

        if (index == 0) {
            addAtStart(data);
        } else {
            Node<T> node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            newNode.next = node.next;
            node.next = newNode;
        }
    }


    /**
     * This method prints all the elements
     * Here Traverse till the null and
     * print till the last node's next element is null
     */
    public void show() {
        Node<T> node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}