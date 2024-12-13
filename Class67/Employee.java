package Class67;

import java.util.Vector;

public class Employee {
    int id;
    String name;
    int salary;
    String department;
    Vector vector = new Vector<>();


    public Employee(int id, String name, int salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'';
    }
}
