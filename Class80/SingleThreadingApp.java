package Class80;

public class SingleThreadingApp {
    public static void main(String[] args) {
        new Login().login();
        new Print().print();
        new Addition().add();
    }
}
