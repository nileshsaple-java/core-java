package com.strings.Examples;

final public class ImmutableClassPractice {
    private final String name;
    private final int age;

   public ImmutableClassPractice(String name, int age){
       this.name = name;
       this.age = age;
   }
   public String getName(){
       return name;
   }

    public int getAge() {
        return age;

    }

    public static void main(String[] args) {
        ImmutableClassPractice std1 = new ImmutableClassPractice("Roshan",24);
        System.out.print("Name is "+ std1.getName()+". He is ");
        System.out.println("Age is "+ std1.getAge());

        ImmutableClassPractice std2 = new ImmutableClassPractice("Rakesh",25);
        System.out.print("Name is "+ std2.getName()+". He is ");
        System.out.println("Age is "+ std2.getAge());
    }
}
