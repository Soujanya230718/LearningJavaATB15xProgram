package ex_02_Java_Basics;

public class PrintF {
    public static void main(String[] args) {
        byte a= 20;
        System.out.println("value of a is:" +a);

        int b= 30;
        System.out.printf("value of b is %d........",b);

        System.out.println(); // adding just for new line
        int a1= 100;
        int b1= 200;
        System.out.printf("Formatting the a1 = %d and b1 = %d", a1, b1);

        System.out.println(); // for new line
        int c = 9;
        System.out.printf("%dx1=%d", c, c*1);

    }
}
