package Class32.Task;

public class PassengerPlane extends Plane{
    @Override
    void takeOff() {
        System.out.println("Passenger Plane is taking off on a middle runway");
    }

    @Override
    void land() {
        System.out.println("Passenger plane is landing on a middle runway");
    }

    @Override
    void fly() {
        System.out.println("Passenger plane is flying in middle speed");
    }

    void carryPassengers() {
        System.out.println("Plane is caring Cargo Planes");
    }
}
