package IfPrograms;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side1");
        int side1= sc.nextInt();

        System.out.println("Enter side2");
        int side2= sc.nextInt();

        System.out.println("Enter side3");
        int side3= sc.nextInt();

        System.out.println("Three sides: " +(side1+side2+side3));
    }

}
