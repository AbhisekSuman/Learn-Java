package Class51;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Student Array Size:");
        Student[] arr = new Student[scanner.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Student " + (i + 1) + " id, Name, gender and mark ");
            arr[i] = new Student(scanner.nextInt(), scanner.next(), scanner.next().charAt(0), scanner.nextInt());
        }

        for (Student s : arr) {
            System.out.println(s.id + " " + s.name + " " + s.gender + " " + s.mark);
        }
    }
}
