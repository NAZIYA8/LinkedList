package com.bridgelabz;

public class Runner {
    public static void main(String[] args) {
        LinkedList<Integer> numberList = new LinkedList<>();
        numberList.add(56);
        numberList.add(30);
        numberList.add(70);

        numberList.show();
        System.out.println();
        int result = numberList.search(30);
        System.out.println("Element present at index  " + result);
    }
}