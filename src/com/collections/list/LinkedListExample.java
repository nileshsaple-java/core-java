package com.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        // Creating a LinkedList of Integers
        List<Integer> numbers = new LinkedList<>();

        // Adding elements to the LinkedList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);  // Duplicates allowed

        // Displaying the LinkedList
        System.out.println("Numbers List: " + numbers);

        // Accessing elements by index
        System.out.println("First number: " + numbers.get(0));

        // Removing an element
        numbers.remove(Integer.valueOf(20));
        System.out.println("After removing 20: " + numbers);

        // Checking if an element exists
        if (numbers.contains(30)) {
            System.out.println("30 is in the list.");
        }

        // Iterating over the list
        System.out.println("Iterating over the list:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
