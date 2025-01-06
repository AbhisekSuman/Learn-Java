package Class87;

import Class86.Student;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        try {
            String path = "E:\\Kodenest\\JAVA\\Class86\\student.txt";

            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream oos = new ObjectInputStream(fis);

            Object o = oos.readObject();
            Student student = (Student) o;
            System.out.println(student);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
