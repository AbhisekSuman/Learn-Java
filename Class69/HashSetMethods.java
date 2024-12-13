package Class69;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSetMethods {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(100);
        hashSet.add(50);
        hashSet.add(150);
        hashSet.add(25);
        hashSet.add(75);
        hashSet.add(125);
        hashSet.add(175);
        System.out.println(hashSet);

        System.out.println("=========================================");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(100);
        linkedList.add(50);
        linkedList.add(150);
        linkedList.add(25);
        linkedList.add(75);
        linkedList.add(75);
        linkedList.add(125);
        linkedList.add(175);
        System.out.println(linkedList);
    }
}
 