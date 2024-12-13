package Class74;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadOnly {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);
        list.add(700);

        System.out.println(list);
        list.remove(5);
        System.out.println(list);
        list.add(800);
        System.out.println(list);

        System.out.println("====================     READ ONLY        ======================");

        list = Collections.unmodifiableList(list);
        System.out.println("result: " + list);

        list.add(10000);
        System.out.println(list);
    }
}
