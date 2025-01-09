package Class91;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateStudent {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Scanner scanner = new Scanner(System.in);

        String path = "jdbc:mysql://localhost:3306/university";
        String sql = "UPDATE STUDENT SET STU_NAME=? WHERE STU_ID=?";
        String user = "root";
        String pw = "2003";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(path,user,pw);
            preparedStatement = connection.prepareStatement(sql);

            System.out.println("Enter ID and New name of the Student");
            int id = scanner.nextInt();
            String name = scanner.next();


            preparedStatement.setInt(2, id);
            preparedStatement.setString(1, name);


            int res = preparedStatement.executeUpdate();
            System.out.println(res + " row(s) Updated");
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
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
