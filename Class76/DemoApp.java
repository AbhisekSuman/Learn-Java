package Class76;

public class DemoApp {
    public static void main(String[] args) {
        try {
            new Demo1().call1();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
