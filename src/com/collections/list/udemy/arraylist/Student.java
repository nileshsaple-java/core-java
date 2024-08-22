package com.collections.list.udemy.arraylist;

public class Student implements Comparable <Student>{
    private int id;
    private String name;

    public Student(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student : " + " id : " + id + "    Name : " + name + " \n";
    }
     public int compareTo(Student that) {
        return Integer.compare(this.id, that.id);
     }
}
