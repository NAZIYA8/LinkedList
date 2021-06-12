package com.bridgelabz;

public class Runner {
    public static void main(String[] args) {
        LinkedList<Integer> numberList = new LinkedList<>();
        numberList.add(56);
        numberList.add(30);
        numberList.add(70);
        System.out.println("Before pop");
        numberList.show();
        System.out.println();
        System.out.println("After pop");
        numberList.popFirst();
        numberList.show();

    }
}
