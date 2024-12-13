package Class32.Task;

public class PlaneApp {
    public static void main(String[] args) {
        Plane ref =  new CargoPlane();
        ref.takeOff();
        ref.fly();
        ref.land();
        ((CargoPlane) ref).carryCargo();

        ref = new PassengerPlane();
        ref.takeOff();
        ref.fly();
        ref.land();
        ((PassengerPlane) ref).carryPassengers();

        ref = new FighterPlane();
        ref.takeOff();
        ref.fly();
        ref.land();
        ((FighterPlane) ref).carryArms();
    }
}
