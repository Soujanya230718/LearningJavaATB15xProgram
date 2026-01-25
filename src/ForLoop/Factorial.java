package ForLoop;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");

        int fact = 1;

        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println(num);
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial is => " + fact);
        } else {
            System.out.println("Please enter a valid int value");
        }

        sc.close();

    }
}
