package ForLoop;

public class Program6 {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
           // System.out.println(i);
            if(i==5) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("End");
    }
}
