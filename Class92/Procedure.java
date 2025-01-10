package Class92;

import java.sql.*;
import java.util.Scanner;

public class Procedure {
    public static void main(String[] args) {
        Connection connection = null;
        CallableStatement callableStatement = null;
        ResultSet result = null;
        Scanner scanner = new Scanner(System.in);

        String path = "jdbc:mysql://localhost:3306/BANK";
        String sql = "CALL getDetails(?)";
        String user = "root";
        String pw = "2003";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(path, user, pw);

            callableStatement = connection.prepareCall(sql);
            int acno = scanner.nextInt();
            callableStatement.setInt(1, acno);

            boolean res = callableStatement.execute();

            if (res) {
                result = callableStatement.getResultSet();
                while (result.next()) {
                    System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3) + " " + result.getInt(4));
                }
            } else
                System.out.println(callableStatement.getResultSet() + " row(s) affected.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (callableStatement != null) {
                    callableStatement.close();
                }
                if (result != null)
                    result.close();
                scanner.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
