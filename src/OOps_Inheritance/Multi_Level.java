package OOps_Inheritance;

public class Multi_Level {
    public static void main(String[] args) {
        Cow C1=new Cow();
        C1.eat();
        C1.bark();
        C1.weep();

    }

    }
class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }

}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}

class Cow extends Dog{
    void weep(){
        System.out.println("Cow is weeping");
    }
}
