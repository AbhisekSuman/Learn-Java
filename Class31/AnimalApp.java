package Class31;

public class AnimalApp {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.name = "Raja";
        lion.age = 20;

        System.out.println("Animal name is: " + lion.name);
        System.out.println("Animal age is: " + lion.age);
        lion.eat();
        lion.sleep();
    }
}
