package Class33;

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle ref = new Car();
        ref.start();
        ref.drive(); //Vehicle.drive();
        ref.stop();
        System.out.println();
        Car car = new Car();
        car.start();
        car.drive(); // Car.drive();
        car.stop();
    }
}
