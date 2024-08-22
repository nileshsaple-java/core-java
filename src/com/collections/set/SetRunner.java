package com.collections.set;

import java.util.*;

public class SetRunner {
    public static void main(String[] args) {

        List<Character> character = List.of('A', 'Z', 'A', 'B', 'F', 'G');
        //Unique - Set
        //Tree
        //Hash
        //LinkedHash

        Set<Character> treeSet = new TreeSet<>(character);
        Set<Character> linkedHashSet = new LinkedHashSet<>(character);
        Set<Character> hashSet = new HashSet<>(character);

        System.out.println("TreeSet Ouput :" + treeSet);
        System.out.println("LinkedHashSet Ouput :" + linkedHashSet);
        System.out.println("HashSet Ouput :" + hashSet);
    }
}
