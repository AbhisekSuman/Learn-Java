package Class73;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(100);
        arrayList.add(50);
        arrayList.add(25);
        arrayList.add(75);
        arrayList.add(125);
        arrayList.add(150);
        arrayList.add(175);
//  yes ListIterator works with ArraytList
        ListIterator<Integer> itr1 = arrayList.listIterator();

        while (itr1.hasNext()) {
            System.out.print(itr1.next() + " ");
        }
        System.out.println();
        System.out.println("==============================");

//        Iterator<Integer> itr2 = arrayList.descendingIterator();
//        descendingIterator is not works with arrayList

        LinkedList list = new LinkedList<>();
        list.addAll(arrayList);
//         Enumeration em1 =

        System.out.println();
        System.out.println("==============================");

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addAll(arrayList);
//        Iterator<Integer> itr3 = deque.listIterator();
//        No
        Iterator<Integer> itr4 = deque.descendingIterator();
        while (itr4.hasNext()) {
            System.out.print(itr4.next());
        }
//        yes
        System.out.println();
        System.out.println("==============================");

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.addAll(arrayList);
//        Iterator<Integer> itr5 = queue.listIterator();
//        NO
//        Iterator<Integer> itr6 = queue.descendingIterator();
//        No
        System.out.println();
        System.out.println("==============================");

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(arrayList);
//        Iterator<Integer> itr7 = treeSet.listIterator();
//        No

        Iterator<Integer> itr8 = treeSet.descendingIterator();
        while (itr8.hasNext()) {
            System.out.print(itr8.next());
        }
//        yes
        System.out.println();
        System.out.println("==============================");

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(arrayList);
//        Iterator itr9 = hashSet.listIterator();
//        No
//        Iterator itr10 = hashSet.descendingIterator();
//   no

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(arrayList);

//        Iterator itr11 = linkedHashSet.listIterator();
//        NO
//        Iterator itr12 = linkedHashSet.descendingIterator();
//        NO
    }
}
