package Class46;

public class StudentApp {
    public static void main(String[] args) {
        Student student =  new Student();

        student.setName("Ram");
        student.setRollNo(20);
        student.setGender("M");

        System.out.println(student.getName());
        System.out.println(student.getGender());
        System.out.println(student.getRollNo());
        System.out.println("************************************");
        student.eat();
        student.sleep();
        student.study();
    }
}
