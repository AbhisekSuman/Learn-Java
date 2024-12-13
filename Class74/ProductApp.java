package Class74;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ProductApp {
    public static void main(String[] args) {
        Keys pid1 = new Keys(100);
        Keys pid2 = new Keys(200);
        Keys pid3 = new Keys(300);
        Keys pid4 = new Keys(400);

        HashMap<Keys, String> products1 = new HashMap<>();

        products1.put(pid1, "Banana");
        products1.put(pid2, "Apple");
        products1.put(pid3, "Pomegranate");
        products1.put(pid4, "Apple");

        ConcurrentHashMap<Keys, String> products2 = new ConcurrentHashMap<>(products1);
        System.out.println(products1);

        System.out.println("Method1 ---> " + removeDuplicates1(products1));
        System.out.println("Method2 ---> " + removeDuplicates2(products2));
    }

    public static HashMap<Keys, String> removeDuplicates1(HashMap<Keys, String> original) {
        Set<Keys> keys = original.keySet();
        Collection<String> values = original.values();
        HashMap<Keys, String> result = new HashMap<>();

        Iterator itr = keys.iterator();

        while (itr.hasNext()) {
            Keys key = (Keys) itr.next();
            String value = original.get(key);

            if (!(Collections.frequency(values, value) > 1)) {
                result.put(key, value);
            }
        }
        return result;
    }

    public static ConcurrentHashMap<Keys, String> removeDuplicates2(ConcurrentHashMap<Keys, String> original) {
        Set<Keys> keys = original.keySet();
        Collection<String> values = original.values();
        Iterator itr = keys.iterator();

        while (itr.hasNext()) {
            Keys key = (Keys) itr.next();
            String value = original.get(key);

            if (Collections.frequency(values, value) > 1) {
                original.remove(key);
            }
        }
        return original;
    }
}
