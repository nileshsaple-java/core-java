package com.strings.Examples;

public final class ImmutableClass {
    private final String name;
    private final int age;

    public ImmutableClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        ImmutableClass student = new ImmutableClass("Roshan", 24);
        student.getName();
        student.getAge();
        System.out.println("My name is " + student.getName() + " and he is " + student.getAge() + " years old.");

        ImmutableClass student1 = new ImmutableClass("Sumit", 29);
        student1.getName();
        student1.getAge();
        System.out.println("My name is " + student1.getName() + " and he is " + student1.getAge() + " years old.");

    ImmutableClass student2 = new ImmutableClass("Amit", 19);
        student2.getName();
        student2.getAge();
        System.out.println("My name is " + student1.getName() + " and he is " + student1.getAge() + " years old.");
}

}



