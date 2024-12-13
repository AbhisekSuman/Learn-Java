package Class77;

import java.util.Scanner;

public class ATM {
    void login() throws Exception {
        System.out.println("CONNECTION TO DB ESTABLISHED");
        System.out.println("Enter user id and pw numbers to divide and login");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        try {
            int c = a / b;
            System.out.println("LOGGED IN....");
        }
//        catch (Exception e) {
//            System.out.println("Exception occurred and resolved in ATM.");
//            throw e;
//        }
         finally {
            System.out.println("Connection to DB terminated.");
        }
    }
}
