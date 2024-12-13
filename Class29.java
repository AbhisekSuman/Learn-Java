import java.util.Scanner;

public class Class29 {
    public static void main(String[] args) {
//        All static methods are called utility method
        BusinessMan b1 = new BusinessMan();
        b1.takeInput();
        b1.calculateSi();
        b1.display();

        BusinessMan b2 = new BusinessMan();
        b2.takeInput();
        b2.calculateSi();
        b2.display();

        BusinessMan b3  = new BusinessMan();
        b3.takeInput();
        b3.calculateSi();
        b3.display();
    }
}

class BusinessMan {
    int p, t;
    static float r;
    float si;

    static  {
        r = 2.0f;
    }

    void takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter p");
        p = scanner.nextInt();
        System.out.println("Enter TIme:");
        t = scanner.nextInt();
    }

    void calculateSi() {
        si = (p *  t * r) / 100;
    }

    void display () {
        System.out.println("SI is: " + si);
    }
}
