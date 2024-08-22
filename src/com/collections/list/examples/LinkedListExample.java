package com.collections.list.examples;

import java.util.*;
public class LinkedListExample {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Banana");
        linkedList.add("Apple");
        linkedList.add("Orange");
        linkedList.add("Mango");

        for(int i = 0; i < linkedList.size(); i++){
            System.out.println(linkedList.get(i));
        }
        System.out.println("=========================");

        for(String fruit : linkedList){
            System.out.println(fruit);
        }
        System.out.println("=========================");

        Iterator<String> iterator = linkedList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
