package Class44;

public class Student {
    String name;
    int age;
    String gender;
    int marks;

    public Student(String name, int age, String gender, int marks) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.marks = marks;
    }

//    Copy Constructor
    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.gender = student.gender;
        this.marks = student.marks;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sllep() {
        System.out.println(name + " is is sleeping.");
    }

    public void study() {
        System.out.println(name + " is is studying.");
    }
}
