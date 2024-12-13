package Class70;

import java.util.LinkedHashSet;

public class StudentApp {
    public static void main(String[] args) {
//        Creating Student Object ->
        Student s1 = new Student(101, "Abhi", 88);
        Student s2 = new Student(102, "Omm", 66);

//        Printing Student ->
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("=============================");

//        checking duplicate object ->
        System.out.println(s1.equals(new Student(101, "Abhi", 88)));
        System.out.println(s1.equals(s2));
        System.out.println("==================================");

//        creating linkedHashset and add all the students and remove the duplicates
        LinkedHashSet<Student> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(s1);
        linkedHashSet.add(s2);
        linkedHashSet.add(new Student(103, "Harihar", 77));
        linkedHashSet.add(new Student(101, "Abhi", 88));
        linkedHashSet.add(new Student(103, "Harihar", 77));

        System.out.println(linkedHashSet);

    }
}
