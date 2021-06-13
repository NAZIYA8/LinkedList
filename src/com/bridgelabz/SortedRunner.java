package com.bridgelabz;

public class SortedRunner {

    public static void main(String[] args) {
        OrderedLinkedList<Integer> numberList = new OrderedLinkedList<Integer>();
        numberList.addData(56);
        numberList.addData(30);
        numberList.addData(40);
        numberList.addData(70);
        System.out.println("List in ascending order");
        numberList.show();
    }
}

