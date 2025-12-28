package TypeCasting;

public class TypeCasting1 {
    public static void main(String[] args) {
        //int a=40;
        //int b= a;
        //int b1= b;
        //System.out.println(b1);

       byte b  = 10;
       int a = b;  //  Valid syntax - Implicit - Casting Widening - JVM/ JAVA
       int a1 = (int)b;
       System.out.println(a1);
    }
}
