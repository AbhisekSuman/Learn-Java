package Class91;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertStudent {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Scanner scanner = new Scanner(System.in);

        String path = "jdbc:mysql://localhost:3306/university";
        String sql = "INSERT INTO STUDENT(stu_id,stu_name) VALUES(?,?)";
        String user = "root";
        String pw = "2003";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(path,user,pw);
            preparedStatement = connection.prepareStatement(sql);

            System.out.println("Enter ID, Name, DOB, Login_Time");
            int id = scanner.nextInt();
            String name = scanner.next();
//            String dob = scanner.next();
//            String login = scanner.next();

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
//            preparedStatement.setString(3, dob);
//            preparedStatement.setString(4, login);

            int res = preparedStatement.executeUpdate();
            System.out.println(res + " row(s) Inserted");
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
