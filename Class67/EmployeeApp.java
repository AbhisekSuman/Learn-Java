package Class67;

import java.util.ArrayList;

public class EmployeeApp {
    public static void main(String[] args) {
        ArrayList <Employee> al = new ArrayList<Employee>();

        Employee emp1 = new Employee(101, "Omm", 50000, "Dev");
        Employee emp2 = new Employee(102, "Harihar", 40000, "Dev");
        Employee emp3 = new Employee(103, "Garuov", 30000, "Management");

        al.add(emp1);
        al.add(emp2);
        al.add(emp3);

        System.out.println(al);
    }
}
