package Class78;

public class DemoApp {
    public static void main(String[] args) {
        try {
            new Demo2().alpha();
        } catch (Exception e) {
            System.out.println("Catch Handle");
            e.printStackTrace();
        }
    }
}
