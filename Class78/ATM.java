package Class78;

import java.util.Scanner;

public class ATM {
    private String pin = "1010";
    Scanner sc = new Scanner(System.in);

    public void withdraw() throws InvalidPinException{

        System.out.println("Enter your PIN");
        String upin = sc.next();

        if (upin.equals(pin)) {
            System.out.println("Money withdraw successfully. Thank You ):");
        } else {
            throw new InvalidPinException();
        }
    }
}
