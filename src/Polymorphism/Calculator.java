package Polymorphism;
                     // method overloading
public class Calculator {
    public static void main(String[] args) {
        addition as= new addition();
        as.add (10,20);
        as.add (10,20,30);
    }

}
class addition {
    void add(int a, int b) {
        System.out.println(a+b);
    }

    void add(int a, int b, int c) {
        System.out.println(a+b+c);
    }

}
