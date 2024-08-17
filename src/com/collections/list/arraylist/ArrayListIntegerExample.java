package com.collections.list.arraylist;

import java.util.ArrayList;

public class ArrayListIntegerExample {
    public static void main(String[] args) {

        //creating an arraylist of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        //Adding elements to the arraylist
        numbers.add(10);
        numbers.add(18);
        numbers.add(16);
        numbers.add(14);

        //Modifying an elements
        numbers.set(1, 19);

        //Remove an element by index
        numbers.remove(0);

        System.out.println("Updated number list" + numbers);
    }
}
