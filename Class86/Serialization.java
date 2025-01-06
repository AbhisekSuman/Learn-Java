package Class86;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) throws IOException {
        Student student = new Student(101, "Abhi", 21);
        System.out.println(student);
        System.out.println("THIS OBJECT WILL BE REMOVED IN 2MS AFTER PROGRAM EXECUTES.");

        String path = "E:\\Kodenest\\JAVA\\Class86\\student.txt";
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(student
        );
    }
}
