package Class77;

public class Bank {
    void initiate() throws Exception {
        System.out.println("CONNECTION TO BANK SERVER ESTABLISHED");
        ATM atm = new ATM();
        try {
            atm.login();
        }
//        catch (Exception e) {
//            System.out.println("issue reached bank and resolved in Bank");
//        }
        finally {
            System.out.println("CONNECTION TO BANK SERVER TERMINATED");
        }
    }
}
