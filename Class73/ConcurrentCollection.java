package Class73;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollection {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        list.add(100);
        list.add(50);
        list.add(150);
        list.add(25);
        list.add(125);
        list.add(175);

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext())  {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        for (Integer integer : list) {
            System.out.print(integer + " ");
            list.add(99);
        }

        System.out.println();
        System.out.println("============================");
        System.out.println(list);
    }
}
