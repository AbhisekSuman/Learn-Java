package Class91;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteStudent {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Scanner scanner = new Scanner(System.in);

        String path = "jdbc:mysql://localhost:3306/university";
        String sql = "DELETE FROM STUDENT WHERE STU_ID=?";
        String user = "root";
        String pw = "2003";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(path,user,pw);
            preparedStatement = connection.prepareStatement(sql);

            System.out.println("Enter ID to delete the student data");
            int id = scanner.nextInt();

            preparedStatement.setInt(1, id);

            int res = preparedStatement.executeUpdate();
            System.out.println(res + " row(s) Deleted");
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
