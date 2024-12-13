package Class31;

public class BirdApp {
    public static void main(String[] args) {
        GoldenEagle goldenEagle = new GoldenEagle();

        goldenEagle.name = "Rani";
        goldenEagle.age = 20;

        System.out.println(goldenEagle.name);
        System.out.println(goldenEagle.age);
        goldenEagle.eat();
        goldenEagle.fly();
    }
}
