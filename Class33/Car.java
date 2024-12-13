package Class33;

public class Car extends Vehicle{
    String name = "BMW";

    @Override
    void start() {
        System.out.println(name + " is starting.........");
    }

    static void drive() {
        System.out.println("BMW car is being driven");
    }

    @Override
    void stop() {
        System.out.println(name + " is stopping");
    }
}
