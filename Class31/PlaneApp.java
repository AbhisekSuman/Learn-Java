package Class31;

public class PlaneApp {
    public static void main(String[] args) {
        CargoPlane cargoPlane = new CargoPlane();
        PassengerPlane passengerPlane = new PassengerPlane();
        FighterPlane fighterPlane =  new FighterPlane();

        cargoPlane.fly();
        cargoPlane.takeOff();

        passengerPlane.fly();
        passengerPlane.takeOff();

        fighterPlane.fly();
        fighterPlane.takeOff();
    }
}
