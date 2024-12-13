public class Class27 {
    public static void main(String[] args) {
        User user = new User();
        user.name = "Abhise Nayk";
        user.course = "Java";
        user.id = 1001;
        user.email = "abhi@kodnest.com";
        user.password = "Abhi@123";
        user.phone = 8917342;
        user.login();
        user.joinClsas();
        user.markAtendance(11);
    }
}

class User {
    String name;
    int id;
    String course;
    int phone;
    String email;
    String password;

    void login() {
        System.out.println("Welcome " + name + " YOU HAVE LOGGED IN USING " + email);
    }

    void joinClsas() {
        System.out.println(name + " Has Joined to " + course + " class");
    }

    void markAtendance(int time) {
        if (time > 15)
            System.out.println("ABSENT");
        else
            System.out.println("PRESENT");

    }
}
