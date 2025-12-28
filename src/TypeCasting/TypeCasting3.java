package TypeCasting;

public class TypeCasting3 {
    public static void main(String[] args) {
        char ch= 'A';
        int ascii = ch; // Widening

        int num = 66; // Narrow
        char letter = (char) num;

    }
}
