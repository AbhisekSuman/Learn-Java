package Class89;

public class Demo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
