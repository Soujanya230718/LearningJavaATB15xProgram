package IfPrograms;

public class FizzBuzzUsingIfelse {
    public static void main(String[] args){
        for(int i=1;i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.print("FizzBuzz: ");
                System.out.println(i);
            }
            else if(i%3==0){
                System.out.print("Fizz: ");
                System.out.println(i);
            }
            else if(i%5==0){
                System.out.print("Buzz: ");
                System.out.println(i);
            }
        }
    }
}
