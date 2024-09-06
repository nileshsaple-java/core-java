package com.strings.Examples;

public class ImmutableString {
    public static void main(String[] args) {
        String name = new String("Hello");
        System.out.println(name.concat(" World"));
        System.out.println(name);

    }
}
