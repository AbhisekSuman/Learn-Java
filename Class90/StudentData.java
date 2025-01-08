package Class90;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentData {
    public static void main(String[] args) throws Exception {
//        Get the data from student table by 6 steps of JDBC

//        Step 1 -> Loading the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded");

//        Step 2 -> Establishing the Connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "2003");
        System.out.println("Connection Established...");

//        Step 3 -> Create statement
        Statement statement = connection.createStatement();
        System.out.println("Statement Created...");

//        Step 4 -> Executing the Query
        String sql = "SELECT * FROM STUDENT";
        ResultSet res = statement.executeQuery(sql);
        System.out.println("Query Executed...");

//        Step 5 -> Display the result
        System.out.println("-----------------          STUDENT TABLE          -----------------------");

        System.out.println("ID        NAME                      DOB             LOGIN_TIME");
        System.out.println("----------------------------------------------------------------------------");
        while (res.next()) {
            System.out.println(res.getInt(1) + "      " + res.getString(2)+ "            " + res.getString(3) + "              " + res.getString(4));
        }


//        Step 6 -> Close the resources
        connection.close();
        statement.close();
        res.close();
    }
}
