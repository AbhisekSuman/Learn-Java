package Class71;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsMethods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(50);
        list.add(150);
        list.add(25);
        list.add(75);
        list.add(125);
        list.add(175);
        list.add(100);
        list.add(100);
        list.add(100);
        System.out.println(list);

//        Sorting
        Collections.sort(list);
        System.out.println(list);

//        binary Searching
        System.out.println(Collections.binarySearch(list, 125));

//        frequency -> how many times a element present
        System.out.println(Collections.frequency(list, 100));

//        Minimum and Maximum element
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));

        List<Integer> list1 = new ArrayList<>();
        list1.add(10000);
        list1.add(5000);
        list1.add(125);
        System.out.println("List1 --> " + list);
        System.out.println("List2 --> " + list1);
//        Disjoint --> return at least 1 common element present or not
        System.out.println(Collections.disjoint(list, list1));

        System.out.println("==============================================");

        List<Integer> list2 = new ArrayList<>();
        list2.add(50);
        list2.add(150);
        list2.add(25);
        list2.add(75);
        list2.add(125);
        list2.add(175);

        System.out.println(list2);
        Collections.sort(list2);
        System.out.println("Sorted " + list2);
        Collections.reverse(list2);
        System.out.println("Reverse " + list2);

//        Another approach of reversed sorting
        System.out.println("**************************************");
        List<Integer> list3 = new ArrayList<>();
        list3.add(50);
        list3.add(150);
        list3.add(25);
        list3.add(75);
        list3.add(125);
        list3.add(175);
        System.out.println(list3);
        Comparator<Object> c = Collections.reverseOrder();
        Collections.sort(list3, c);
        System.out.println(list3);

        
    }
}
