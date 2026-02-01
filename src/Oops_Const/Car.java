package Oops_Const;

public class Car {
    String brand;
    long price;

    Car(String brand, long price){
        this.brand=brand;
        this.price=price;
    }

    void show(){
        System.out.println(brand+"\n"+price);
    }

    public static void main(String[] args){
        Car c1=new Car("swift", 38988978l);
        c1.show();
    }
}
