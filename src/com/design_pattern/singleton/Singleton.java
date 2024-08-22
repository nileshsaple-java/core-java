package com.design_pattern.singleton;

public class Singleton {

    static Singleton singleton = null;

    private Singleton(){}

    public static Singleton getInstance() {
        if(singleton == null )
            singleton = new Singleton();

        return singleton;
    }
}

class Main{
    public static void main(String[] args) {

        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();

        System.out.println(s);
        System.out.println(s1);
    }
}
