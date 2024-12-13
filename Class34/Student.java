package Class34;

public class Student {
    int id;
    String name;
    String email;
    int marks;

    Brain brain = new Brain();

    void buyBook(Book book) {
        System.out.println(name + " is buying a book of cost " + book.cost + " written by " + book.author);
    }
}
