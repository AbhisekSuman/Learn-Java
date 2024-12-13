package Class34.Task;

public class StudentApp {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Shyam";
        student.age = 18;
        student.gender = 'M';

        student.heart.weight = 1500;
        student.heart.color = "Red";

        student.bike = new Bike();
        student.bike.brand = "Hero";
        student.bike.cost = 90000;

        student.id = 101;
        student.mark = 60;
        student.phoneNo = 6913;
        student.aggregate = "*****";

        student.brain.color = "White";
        student.brain.weight = 600;

        Car car = new Car();
        car.brand = "BMW";
        car.cost = 6000000;
        car.color = "Black";
        car.engine.type = "Petrol";
        car.engine.bhp = "....";

        student.displayStudentDetails(car);
    }
}
