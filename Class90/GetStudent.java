package Class90;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class GetStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        String sql = "SELECT * FROM STUDENT WHERE STU_ID = ?";

        String url = "jdbc:mysql://localhost:3306/university";
        String user = "root";
        String pw = "2003";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(url, user, pw);

            statement = connection.prepareStatement(sql);
            System.out.println("Enter ID: ");
            int id = scanner.nextInt();
            statement.setInt(1, id);

            result = statement.executeQuery();

            if (result.next()) {
                System.out.println(result.getInt(1) + "  " + result.getString(2) + "   " + result.getString(3) + "   " + result.getString(4));
            } else {
                System.out.println("NO STUDENT FOUND OF THIS ID .. ):");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                statement.close();
                result.close();
                scanner.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
