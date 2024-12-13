package Class43;

public class Worker extends Employee{
    int salary;
    int rating;

    public Worker() {
        super();
        this.salary = 10000;
        this.rating = 5;
    }

    public Worker(int salary) {
        this(salary, 5);
        this.salary = salary;
        this.rating = 5;
    }

    public Worker(int salary, int rating) {
        super("Omm", 21);
        this.salary = salary;
        this.rating = rating;
    }
}
