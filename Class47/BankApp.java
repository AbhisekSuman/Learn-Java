package Class47;

public class BankApp {
    public static void main(String[] args) {

        Bank bank = new Bank("34989884163", 123456, 120364.023);
        System.out.println(bank.getAccNo() + " " + bank.getPwd() + " " + bank.getBal());
    }
}
