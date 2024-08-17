package com.collections.list.arraylist;

import java.util.ArrayList;

public class ArrayListSearchExample {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");

        //Searching for an elements
        String searchCity = "Los Angeles";
        if (cities.contains(searchCity)) {
            System.out.println(searchCity + " is found in the list.");
        } else {
            System.out.println(searchCity + " is not in the list");
        }
    }
}
