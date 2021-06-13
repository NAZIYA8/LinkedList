package com.bridgelabz;

public class OrderedLinkedList<T extends Comparable<T>> {
    Node<T> head;

    /**
     * @param data element passed
     */
    public void addData(T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;
        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            if (data.compareTo(head.data) < 0) {
                newNode.next = head;
                head = newNode;
                return;
            }
            Node<T> currentNode = head;
            Node<T> previousNode = head;
            if (currentNode != null) {
                while (currentNode.next != null || currentNode.data != null) {
                    if (data.compareTo(currentNode.data) <= 0) {
                        previousNode.next = newNode;
                        newNode.next = currentNode;
                        break;
                    }
                    previousNode = currentNode;
                    currentNode = currentNode.next;
                    if (currentNode == null) {
                        break;
                    }
                }
            }
            previousNode.next = newNode;
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

