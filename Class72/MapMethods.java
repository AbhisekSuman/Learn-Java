package Class72;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapMethods {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap();
        hashMap.put(100, "Kavya");
        hashMap.put(50,"Kalpana");
        hashMap.put(150, "Keerthan");
        hashMap.put(25, "Kanchana");
        hashMap.put(75, "Kareena");
        hashMap.put(175, "Kamalakshi");
        System.out.println(hashMap);
        System.out.println("=================");

        Set set = hashMap.keySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        System.out.println("================");

        Collection collection = hashMap.values();
        itr = collection.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        System.out.println("==================");
        Set s1 = hashMap.entrySet();
        itr = s1.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
    }
}
