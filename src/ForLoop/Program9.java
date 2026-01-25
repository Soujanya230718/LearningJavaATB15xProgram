package ForLoop;

public class Program9 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if(i%2!=0){
                continue;
                //break;
            }
            System.out.println(i);
        }
    }
}
