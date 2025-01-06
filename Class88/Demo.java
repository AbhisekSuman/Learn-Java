package Class88;

import java.util.ArrayList;

public class Demo {
//    @SuppressWarnings()
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int a = 10;
        Demo1 d2 = new Demo2();
        d2.sample();
        d2.greet();

        @SuppressWarnings({"unused", "rowtypes"})
        ArrayList arrayList = new ArrayList<>();
    }
}
