package IncrementDecrement;

public class Pro4 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a++ + ++a);        //10 + 12
        System.out.println(a);         // 12
        System.out.println(a++);     //12
        System.out.println(++a);    // 14
        System.out.println(a++);       // 14
        System.out.println(++a + ++a);      // 16 + 17

    }
}
