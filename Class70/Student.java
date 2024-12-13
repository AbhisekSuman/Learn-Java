package Class70;

import java.util.Objects;

public class Student implements Comparable {
    int id;
    String name;
    int mark;

    public Student(int id, String name, int mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student(" + id + " " + name + " " + mark + ")";
    }

    @Override
    public boolean equals(Object obj) {
        Student ref = (Student) obj;
        return this.id == ref.id && this.name.equals(ref.name) && this.mark == ref.mark;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, mark);
    }


    @Override
    public int compareTo(Object o) {
        Student ref = (Student) o;
        return this.name.compareTo(ref.name);
    }
}

