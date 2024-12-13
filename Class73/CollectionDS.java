package Class73;

import java.util.*;

public class CollectionDS {
    public static void main(String[] args) {
        Collection<Integer> ref = new ArrayList<>();

        ref.add(100);
        ref.add(150);
        ref.add(25);
        ref.add(50);
        ref.add(75);
        ref.add(125);
        ref.add(175);
        ref.add(100);
        ref.add(50);
        ref.add(null);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(ref);
        System.out.println(ref);
        System.out.println("YES YES");

        ref = new LinkedList<>();
        ref.addAll(arrayList);
        System.out.println(ref);
        System.out.println("YES YES");

        ref = new ArrayDeque<>();
//        ref.addAll(arrayList);
        System.out.println(ref);
        System.out.println("YES NO");

        ref = new PriorityQueue<>();
        ref.addAll(arrayList);
        System.out.println(ref);
        System.out.println("YES NO");

        ref = new TreeSet<>();
//        ref.addAll(arrayList);
        System.out.println(ref);
        System.out.println("NO NO");

        ref = new HashSet<>();
        ref.addAll(arrayList);
        System.out.println(ref);
        System.out.println("NO NO");

        ref = new LinkedHashSet<>();

    }
}
