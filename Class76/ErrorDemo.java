package Class76;

public class ErrorDemo {
    public static void main(String[] args) {
//        try {
//            greet();
//        } catch (Error e) {
//            System.out.println(e);
//        }
    }

    private static void greet() {
        System.out.println("Hello");
        greet();
    }
}
