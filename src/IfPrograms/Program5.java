package IfPrograms;
import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number");
        int age= scanner.nextInt();
        String name= scanner.nextLine();
        if(age<10){
            System.out.println("kid");
        }
        else if(age==30){
            System.out.println("adult");
        }
        else{
            System.out.println("old");
        }
       // scanner.close();
    }
}
