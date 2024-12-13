package Class74;

import java.util.HashSet;

public class UnBoxing {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(8);
        hashSet.add(0);
        hashSet.add(9);
        hashSet.add(5);
        hashSet.add(0);
        hashSet.add(0);
        hashSet.add(0);
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        System.out.println(hashSet);

        Object[] arr = hashSet.toArray();
        int[] array = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            Integer j = (Integer) arr[i];
//            Unboxing
            array[i] = j.intValue();
        }
        System.out.println("=============================");

        for (int i: array) {
            System.out.print(i + " ");
        }
    }
}
