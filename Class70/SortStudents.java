package Class70;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class SortStudents {
    public static void main(String[] args) {
//        Sorting test with int
        List<Integer> ref = new ArrayList<>();
        ref.add(86);
        ref.add(42);
        ref.add(23);
        ref.add(18);
        ref.add(25);
        System.out.println("ArrayList --> " + ref);

//        Approach 1
        TreeSet<Integer> ts = new TreeSet<>(ref);
        System.out.println("TreeSet --> " + ts);

//        Approach 2
        Collections.sort(ref);
        System.out.println("ArrayList --> " + ref);

//        sorting the Student (by the help of overriding compareTo method)
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(101, "Abhi", 88));
        studentList.add(new Student(102, "Omm", 66));
        studentList.add(new Student(103, "Harihar", 77));
        System.out.println("Array List -> " + studentList);
        Collections.sort(studentList);
        System.out.println("Sorted Student acc to name -> " + studentList);
    }
}
