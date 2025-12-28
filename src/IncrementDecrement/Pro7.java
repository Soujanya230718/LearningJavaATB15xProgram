package IncrementDecrement;

public class Pro7 {
    public static void main(String[] args) {
        int a=10;
        int b= a--;
        System.out.println(b);
        System.out.println(a);
        System.out.println(a-- + --a); //9 7
       // System.out.println(b);   // 10
    }
}
