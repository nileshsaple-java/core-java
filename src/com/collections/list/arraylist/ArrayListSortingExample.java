package com.collections.list.arraylist;

import java.util.*;


public class ArrayListSortingExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();

        // Adding elements to the ArrayList
        names.add("John");
        names.add("Alice");
        names.add("Bob");

        // Sorting the ArrayList
        Collections.sort(names, Collections.reverseOrder());

        // Printing the sorted ArrayList
        System.out.println("Sorted names: " + names);
    }
}
