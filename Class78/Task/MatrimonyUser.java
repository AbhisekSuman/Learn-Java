package Class78.Task;

import java.util.Scanner;

public class MatrimonyUser {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private int age;
    private String gender;

    void acceptData() throws Exception {
        this.name = scanner.nextLine();
        this.age = scanner.nextInt();
        this.gender = scanner.next();

        if (age > 21 && age < 50) {
            System.out.println("Valid User You will get married");
        } else if (age < 21) {
            throw new UnderAgeException();
        } else {
            throw new OverAgeException();
        }
    }
}
