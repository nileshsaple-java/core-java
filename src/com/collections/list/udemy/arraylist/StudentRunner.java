package com.collections.list.udemy.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) {
        List<Student> student = List.of(new Student(301, "Roshan Saple"),
                new Student(201, "Rohan Khanna"),
                new Student(101, "Rakesh Sharma"));

        //convert list to arraylist
        List<Student> studentsAl = new ArrayList<>(student);
        Collections.sort(studentsAl);
        System.out.println(studentsAl);

    }
}
