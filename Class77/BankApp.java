package Class77;

public class BankApp {
    public static void main(String[] args) {
        System.out.println("Main Connection Established.");
        Bank bank = new Bank();
        try {
            bank.initiate();
        } catch (Exception e) {
            System.out.println("Exception reached to Main and resolved it in Main.");
        }
        System.out.println("Main Connection Terminated.");
    }
}
