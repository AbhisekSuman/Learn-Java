package Class32.Task;

public class FighterPlane extends Plane{
    @Override
    void fly() {
        System.out.println("Fighter Plane is flying very speed");
    }

    @Override
    void land() {
        System.out.println("Fighter Plane is landing on small runway");
    }

    @Override
    void takeOff() {
        System.out.println("Fighter Plane is taking off on a small runway");
    }

    void carryArms() {
        System.out.println("Plane is caring Cargo Planes");
    }
}
