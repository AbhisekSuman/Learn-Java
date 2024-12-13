package Class34.Task;

public class Student extends Human{
    int id;
    int mark;
    int phoneNo;
    String aggregate;

    Brain brain = new Brain();

    void displayStudentDetails(Car car) {
        System.out.println("Basic Details -");
        System.out.println("Student name is: " + name);
        System.out.println("Student age is: " + age);
        System.out.println("Student gender is: " + gender);
        System.out.println("Student ID:- " + id);
        System.out.println("Student mark:- " + mark);
        System.out.println("Student Phone No:- " + phoneNo);
        System.out.println("Student aggregate:- " + aggregate);
        System.out.println();
        System.out.println("Student Heart Details -");
        System.out.println("Student heart color is:- " + heart.color);
        System.out.println("Student heart weight is:- " + heart.weight);
        System.out.println();
        System.out.println("Student Bike Details - ");
        System.out.println("Student has a " + bike.brand + " bike of cost " + bike.cost);
        System.out.println();
        System.out.println("Student Brain Details: ");
        System.out.println("Student Brain color is: " + brain.color);
        System.out.println("Student Brain weight is: " + brain.weight);
        System.out.println();
        System.out.println("Student Car Details:- ");
        System.out.println("Student has a " + car.color + " " + car.brand + " car of cost " + car.cost);
        System.out.println("Car engine type is " + car.engine.type);
        System.out.println("Car engine bhp is " + car.engine.bhp);
    }
}
