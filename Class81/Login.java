package Class81;

import java.util.Scanner;

public class Login implements Runnable {
    @Override
    public void run() {
        login();
    }

    void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Login Activity started....");
        System.out.println("Enter Username: ");
        String user = sc.next();
        System.out.println("Enter password");
        String pw = sc.next();
        System.out.println("Logged in successfully");
        System.out.println("Login Activity ended.");
    }
}
