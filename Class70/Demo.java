package Class70;


import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashSet set =  new HashSet();

        for (int i = 0; i < n; i++) {
            set.add(new Car(sc.next(), sc.nextInt()));
        }
        System.out.println("Unique cars in the HashSet:");
        Iterator i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}

class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return (this.model.equals(((Car) obj).model) && this.year == ((Car) obj).year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }
}

