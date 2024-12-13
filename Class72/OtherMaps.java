package Class72;

import Class70.Student;

import java.util.IdentityHashMap;
import java.util.WeakHashMap;

public class OtherMaps {
    public static void main(String[] args) {
        Integer k1 = new Integer(100);
        Integer k2 = new Integer(200);
        Integer k3 = new Integer(300);

        Student s1 = new Student(1, "Sri", 99);
        Student s2 = new Student(2, "Sai", 66);
        Student s3 = new Student(3, "Abhi", 98);

        WeakHashMap<Integer, Student> map = new WeakHashMap<>();
        map.put(k1, s1);
        map.put(k2, s2);
        map.put(k3, s3);

        System.out.println("WHM ---> " + map);

        k1 = null;
        s1 = null;

        System.gc();

        for (int i = 0; i < 10000; i++) {
            System.out.print("");
        }

        System.out.println();
        System.out.println("===================");
        System.out.println("WHM ---> " + map);
        System.out.println("====================");

        String key1 = new String("Ramu");
        String key2 = new String("Ramu");

        IdentityHashMap identityHashMap = new IdentityHashMap();
        identityHashMap.put(key1, 100);
        identityHashMap.put(key2, 200);
        System.out.println("Identity HashMap ---> " + identityHashMap);
    }
}
