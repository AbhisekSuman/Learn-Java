package Class66;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class CollectionFramework {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add(100);
        arrayList.add(50);
        arrayList.add("Ramu");
        arrayList.add("Somu");
        arrayList.add(3.147f);
        arrayList.add(true);

        System.out.println(arrayList);

        System.out.println("==========================================");
        LinkedList ll = new LinkedList();
        ll.add(100);
        ll.add(50);
        ll.add(150);
        ll.add(25);
        ll.add(75);
        ll.add(125);
        ll.add("Ramu");
        ll.add("Somu");
        System.out.println(ll);

        System.out.println("=================================================");
        System.out.println("Using For loop");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
        System.out.println("==========================================");
        System.out.println("Using iterator");
        Iterator itr = arrayList.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        System.out.println("============================================");
        System.out.println("Using traditional for loop");
        for (Object o: arrayList) {
            System.out.print(o + " ");
        }

        Stack stack = new Stack<>();
        stack.push(100);
        stack.pop();
    }
}
