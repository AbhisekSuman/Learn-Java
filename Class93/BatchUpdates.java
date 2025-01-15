package Class93;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BatchUpdates {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Scanner scanner = new Scanner(System.in);
        String url  = "jdbc:mysql://localhost:3306/bank?user=root&password=2003";
        String sql = "insert into jbi values(?, ?, ?, ?);";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url);
            preparedStatement = connection.prepareStatement(sql);

            System.out.println("Enter no of Rows: ");
            int nor = scanner.nextInt();

            for (int i = 0; i < nor; i++) {
                System.out.println("Enter Acc NO, Name, email, balance");
                int accNo = scanner.nextInt();
                String name = scanner.next();
                String emal = scanner.next();
                int bal = scanner.nextInt();

                preparedStatement.setInt(1, accNo);
                preparedStatement.setString(2, name);
                preparedStatement.setString(3, emal);
                preparedStatement.setInt(4, bal);

                preparedStatement.addBatch();
            }
            int res[] = preparedStatement.executeBatch();

            for (int i: res) {
                System.out.println(i + " row(s) inserted.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                preparedStatement.close();
                scanner.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
