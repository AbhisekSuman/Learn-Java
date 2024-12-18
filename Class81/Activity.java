package Class81;

import java.util.Scanner;

public class Activity extends Thread {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("login"))
            login();
        else if (name.equals("print")) {
            print();
        }
        else
            add();
    }

    void add() {
        try {
            System.out.println("Addition Activity started..");
            long l1 = 2147483649L;
            long l2 = 6444613L;
            long sum = l1 + l2;
            Thread.sleep(5000);
            System.out.println("Addition result is: " + sum);
            System.out.println("Addition Activity is ended.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void print() {
        try {
            System.out.println("Printing Activity started..");
            for (int i = 0; i < 5; i++) {
                System.out.println("Kodnest");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Printing Activity ended.");
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
