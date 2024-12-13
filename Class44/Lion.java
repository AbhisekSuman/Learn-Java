package Class44;

public class Lion extends Animal{
    String name = "Rani";

    @Override
    public void eat() {
        super.eat();
        System.out.println("Meat!!!");
    }

    public void dispaly() {
        System.out.println(super.name);
        System.out.println(name);
    }
}
