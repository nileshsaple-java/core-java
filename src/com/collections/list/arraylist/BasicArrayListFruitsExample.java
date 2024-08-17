package com.collections.list.arraylist;

import java.util.ArrayList;

public class BasicArrayListFruitsExample {

    public static void main(String[] args) {

        //creating an ArrayList of string
        ArrayList<String> fruits = new ArrayList<>();

        //Adding elements to the ArrayList
        fruits.add("zeeee");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

       // Object[] fruitsArray = fruits.toArray();

        // Retrieving and printing the elements from the ArrayList
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Accessing an element by index
        System.out.println("First Fruit : "+ fruits.get(0)+ "\nSecond Fruit : "+ fruits.get(1)+"\nSecond Fruit : "+ fruits.get(2));
    }
}

