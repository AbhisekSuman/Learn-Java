public class Question1 {
    public static void main(String[] args) {
        System.out.println("Hey...");
        int[] mark = {100, 200, 300};
        Student student = new Student("Abhi", 20, mark);
        System.out.println(student.getAge());
        System.out.println(student.getName());
        System.out.println(student.maxMark());
    }
}

class Student {
    private String name;
    private int age;
    private int[] marks = new int[3];

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int[] getMarks() {
        return marks;
    }

    public int maxMark() {
        int max = marks[0];
        if (marks[1] >= marks[0] && marks[1] >= marks[2]) {
         max = marks[1];
        }
        else if(marks[2]>=marks[0]){
            max= marks[2];
        }
        return max;
    }

    Student(String stu_name, int stu_age, int[] stu_mark) {
        name = stu_name;
        age = stu_age;
        marks = stu_mark;
    }
}