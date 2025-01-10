package Class92;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("********************        WELCOME TO JBI(JAVA BANK OF INDIA)      ***************************");
        System.out.println("Enter your Acc no");
        int to = scanner.nextInt();

        System.out.println("Enter receiver's Acc no: ");
        int from = scanner.nextInt();

        System.out.println("Enter the amount: ");
        int amt = scanner.nextInt();

        transferMoney(from, to, amt);

        scanner.close();
    }

    public static void transferMoney(int from, int to, int amt) {
        Connection connection = null;
        PreparedStatement preparedStatement1 = null;
        PreparedStatement preparedStatement2 = null;

        String path = "jdbc:mysql://localhost:3306/bank";
        String sql1 = "UPDATE JBI SET BALANCE=BALANCE-? WHERE ACCNO=?";
        String sql2 = "UPDATE JBI SET BALANCE=BALANCE+? WHERE ACCNO=?";
        String user = "root";
        String pw = "2003";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(path, user, pw);

            connection.setAutoCommit(false);

            preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement2 = connection.prepareStatement(sql2);

            preparedStatement1.setInt(1, amt);
            preparedStatement1.setInt(2, from);

            preparedStatement2.setInt(1, amt);
            preparedStatement2.setInt(2, to);

            preparedStatement1.executeUpdate();
            System.out.println(amt + " Debited to your account ):");

            preparedStatement2.executeUpdate();
            System.out.println(amt + " Credited to acc: " + to);

            connection.commit();
            System.out.println("Transaction Successful");
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
                preparedStatement1.close();
                preparedStatement2.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


