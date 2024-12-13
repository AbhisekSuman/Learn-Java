import java.util.Scanner;

public class Class30 {
    public static void main(String[] args) {
//        Eagle eagle = new Eagle();
//        eagle.name = "Eagle1";
//        eagle.fly();
//        eagle.eat();
       int r = 7;
        System.out.println(3.141 * r * r);
    }
}

class Bird {
    String name;
    void fly() {
        System.out.println(name + " is flying");
    }
}

class Eagle extends Bird{
    int age = 12;
    void eat() {
        System.out.println(name + " is eating");
    }
}

