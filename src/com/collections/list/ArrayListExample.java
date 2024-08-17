package com.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        //fruits.add(10);
        fruits.add("Apple");  // Duplicates allowed
        fruits.add("Nilesh");


        // Displaying the ArrayList
        System.out.println("Fruits List: " + fruits);//Fruits List: [Apple, Banana, Orange, Apple]

        fruits.add(3, "Ved");
        System.out.println("Fruits List: " + fruits);//Fruits List: [Apple, Banana, Orange, Ved, Apple, Nilesh]

       // System.exit(0);
        // Accessing elements by index
        System.out.println("First fruit: " + fruits.get(0)); //First fruit: Apple
        System.out.println("First fruit: " + fruits.get(3)); //First fruit: Ved

        // Removing an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);
        //After removing Banana: [Apple, Orange, Ved, Apple, Nilesh]


        // Checking if an element exists
        if (fruits.contains("Orange")) {
            System.out.print("Orange is in the list.");//Orange is in the list.
        }

        System.out.println("====printing Data for primitive types ========");
        System.out.println("Fruits List: " + fruits);

        System.out.println("====    Iterating over the list ========");
        System.out.println("\n\n====iterating List - Enhanced for Loop ========");
        // Iterating over the list using enhanced for loop

        for (String fruit : fruits) {
            System.out.print(fruit+ " ");
        }

        System.out.println("\n\n====iterating List - normal for loop ========");
        // Iterating over the list using normal for loop
        for(int i=0; i< fruits.size(); i++){
            System.out.print(fruits.get(i)+ " ");
        }

        System.out.println("\n\n====iterating List - collection iterator() ========");
        // Iterating over the list using collection iterator
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()){
            String val = iterator.next();
            System.out.print(val+ " ");
        }
    }
}
