package DoWhile;

public class Program2 {
    public static void main(String[] args) {
        int a = 0;
        do {
        System.out.println(a);
           a++;
        } while (a < 0);
        // o/p: 0 but for same value and same condition for while loop it will return nothing.
       // int i = 0;
        //while (i < 0) {
           // System.out.println(i);
           // i++;

        //}
    }
}