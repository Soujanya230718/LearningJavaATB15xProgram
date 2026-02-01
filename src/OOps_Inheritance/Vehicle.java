package OOps_Inheritance;

class Car {
   Car() {

        System.out.println("Vehicle constructor");
    }
}

class Bike extends Car {
    Bike() {

        System.out.println("Bike constructor");
    }
}

class Jeep extends Bike {
   Jeep() {

        System.out.println("Car constructor");
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Jeep jp= new Jeep();

    }
}