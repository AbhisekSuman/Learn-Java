package Class78;

public class Bank {
    void initiate() {
        ATM atm = new ATM();
        try {
            atm.withdraw();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            try {
                atm.withdraw();
            } catch (Exception e1) {
                System.out.println(e1.getMessage());
                try {
                    atm.withdraw();
                } catch (Exception e2) {
                    System.out.println("Sorry no tries left. Card Blocked");
                }
            }
        }
    }
}
