public class Pyramid {
    public static void main(String[] args) {
        int rows=5;
        for (int i = 1; i <= rows; i++) {

            // print left spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // print stars with space
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // move to next line
            System.out.println();
        }
    }
}



