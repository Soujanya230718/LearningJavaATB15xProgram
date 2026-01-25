package ForLoop;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        for(int i=0; i<num; i++){
            if(i==5){
                continue;

            }
            System.out.println(i);


        }
    }
}
