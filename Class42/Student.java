package Class42;

public class Student {
    String name;
    int age;
    String gender;
    int marks;

    public Student(String name, int age, String gender, int marks) {
        this.name = name;
        this.age = age;
        this.gender=gender;
        this.marks = marks;
    }

    public void eat() {
        System.out.println(name + " student is eating");
    }

    public void sleep() {
        System.out.println(name + " student is sleeping.");
    }

    public void study() {
        System.out.println(name + " student is studying.");
    }
}
