package ex_02_Java_Basics;

import java.util.Scanner;
public class TableusingScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.print("enter your number: ");

        int a= scanner.nextInt();

        System.out.printf("%d*1=%d", a, a*1);
    scanner.close();
    }
}
