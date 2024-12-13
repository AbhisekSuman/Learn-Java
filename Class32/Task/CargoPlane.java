package Class32.Task;

public class CargoPlane extends Plane{
    @Override
    void fly() {
        System.out.println("Cargo Plane is flying very slow");
    }

    @Override
    void land() {
        System.out.println("Cargo Plane is landing on huge runway");
    }

    @Override
    void takeOff() {
        System.out.println("Cargo Plane is taking of on a huge runway");
    }

    void carryCargo() {
        System.out.println("Plane is caring Cargo Planes");
    }
}
