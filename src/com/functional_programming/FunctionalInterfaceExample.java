package com.functional_programming;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

class Add implements Calculator{
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}

class Sub implements Calculator{
    @Override
    public int calculate(int a, int b){
        return a - b;
    }
}
class Mul implements Calculator {
    @Override
    public int calculate(int a, int  b) {
        return a * b;
    }
}
/*
class Sub implements Calculator{
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}

class Mul implements Calculator{
    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}
*/


public class FunctionalInterfaceExample {
    public static void main(String[] args) {

        //Traditional Approach --> create classes to implement interface
        Calculator add = new Add();
        int addResult = add.calculate(100, 10);
       // System.out.println(addResult);
        System.out.println("addResult :: "+addResult);
        //System.out.println( new Add().calculate(100, 10) );

        Calculator sub = new Sub();
        int subResult = sub.calculate(100,10);
        System.out.println("subResult :: "+subResult);
        //System.out.println(new Sub().calculate(100,10));


        Calculator mul = new Mul();
        int mulResult = mul.calculate(100,10);
        System.out.println("mulResult :: "+mulResult);
       //System.out.println(new Mul().calculate(100,10));




        //========================================================================

        System.out.println("====> Anonymous Class Example<========");
        Calculator addAnonymousClass = new Calculator(){
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };
        System.out.println("addAnonymousClass :: " + addAnonymousClass.calculate(100, 10));

        Calculator subAnonymousClass = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a - b;
            }
        };
        System.out.println("subAnonymousClass :: " + subAnonymousClass.calculate(100,10));

        Calculator mulAnonymousClass = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a * b;
            }
        };
        System.out.println("mulAnonymousClass :: " +mulAnonymousClass.calculate(100,10));


        //========================================================================

        System.out.println("====> Functional Programming Example <========");

        Calculator addFP = (a, b) -> {
            return a + b;
        };
        //Calculator add = (a, b) -> a + b; // when single line, no need to give block
        System.out.println("addFP :: "+addFP.calculate(100, 10));



        Calculator subPF = (a, b) -> {
            return a - b;
        };
        System.out.println("subPF :: "+subPF.calculate(100,10));



        Calculator mulPF = (a,b) -> {
            return a * b;
        };
        System.out.println("mulPF:: "+ mulPF.calculate(100,10));

    }
}


