package ForLoop;

public class EvenOdd {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if(i%2!=0){

                continue;
       //System.out.println("odd numbers are:" +i);
            }
            System.out.println(i);
        }

    }
}
