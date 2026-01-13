package IfPrograms;
import java.util.Scanner;
public class Prorgrm7Sides {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the side1: ");
        int side1= sc.nextInt();
        System.out.print("Enter the side2: ");
        int side2= sc.nextInt();
        System.out.print("Enter the side3: ");
        int side3=sc.nextInt();

        System.out.print(side1+side2+side3);
        sc.close();
    }
}
