package com.collections.list.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        System.out.println("===================================");
        List<String> list = List.of("Apple", "Banana", "Orange");
        List<String> arrayList = new ArrayList<>(list);
        arrayList.add("Mango");

        System.out.println(arrayList);
        System.out.println("Using for loop with index");
        // 1. Using for loop with index
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("==================");

        //using Enhance for loop
        System.out.println("Using enhance for loop");
        for (String fruit : arrayList) {
            System.out.println(fruit);

        }
        System.out.println("==========================");
        System.out.println("Using Iterator");
        //Using iterator
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
