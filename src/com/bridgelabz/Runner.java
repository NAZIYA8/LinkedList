package com.bridgelabz;

public class Runner {
    public static void main(String[] args) {
        LinkedList<Integer> numberList = new LinkedList<>();
        numberList.add(56);
        numberList.add(30);
        numberList.add(40);
        numberList.add(70);
        numberList.show();
        System.out.println();
        System.out.println("After deleting..");
        int result = numberList.search(40);
        numberList.delete(result);
        int Size = numberList.size();
        numberList.show();
        System.out.println("The size of the list is " + Size);
    }
}