package com.functional_programming;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        String name = "Roshan";

        System.out.println("name.isEmpty() :: "+name.isEmpty());

        //java.util.function.Predicate<T>:
        //Method: boolean test(T t)

        Predicate<String> isEmpty = (s) -> s.isEmpty();

        System.out.println(isEmpty.test(name)); // Output: true

    }
}
