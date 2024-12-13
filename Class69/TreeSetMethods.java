package Class69;

import java.util.TreeSet;

public class TreeSetMethods {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(100);
        treeSet.add(50);
        treeSet.add(150);
        treeSet.add(25);
        treeSet.add(75);
        treeSet.add(125);
        treeSet.add(175);

        System.out.println("Tree set is -> " + treeSet);
        System.out.println("=================================================");

        System.out.println("ceiling(45) => " + treeSet.ceiling(45));
        System.out.println("higher(45) => " + treeSet.higher(45));
        System.out.println("ceiling(50) => " + treeSet.ceiling(50));
        System.out.println("higher(50) => " + treeSet.higher(50));

        System.out.println("floor(45) => " + treeSet.floor(45));
        System.out.println("lower(45) => " + treeSet.lower(45));
        System.out.println("floor(75) => " + treeSet.floor(75));
        System.out.println("lower(75) => " + treeSet.lower(75));
        System.out.println("====================================================");

        System.out.println(treeSet.headSet(75));
        System.out.println(treeSet.tailSet(75));
    }
}
