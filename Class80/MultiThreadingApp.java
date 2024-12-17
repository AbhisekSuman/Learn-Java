package Class80;

public class MultiThreadingApp {
    public static void main(String[] args) {
        Login login = new Login();
        Print print = new Print();
        Addition addition = new Addition();

        login.start();
        print.start();
        addition.start();
    }
}
