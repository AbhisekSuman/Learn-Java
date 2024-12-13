package Class34;

public class StudentApp {
    public static void main(String[] args) {
        Student student = new Student();
        Book book = new Book();

        book.author = "William Shakespeare";
        book.cost = 100;

        student.id = 101;
        student.name = "Ram";
        student.email = "ram@kodnest.com";
        student.brain.color = "Red";
        student.brain.weight = 6;


        System.out.println("Student ID " + student.id);
        System.out.println("Student Name: " + student.name);
        System.out.println("Student email: " + student.email);
        System.out.println("Student Brain Color is " + student.brain.color + " and weight is " + student.brain.weight);
        student.buyBook(book);
    }
}
