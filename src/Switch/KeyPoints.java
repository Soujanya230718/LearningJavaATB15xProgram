package Switch;

public class KeyPoints {
    public static void main(String[] args) {

               // java 13  above
        int itemCode = 003;
        switch (itemCode) {
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("default");

        }
    }
}
