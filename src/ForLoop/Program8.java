package ForLoop;

public class Program8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if(i==5) {
                // break;   // o/p: 1, 2, 3, 4
                continue;    // o/p: 1 to 10 except--> 5
            }
                System.out.println(i);

        }
    }
}
