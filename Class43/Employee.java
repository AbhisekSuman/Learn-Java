package Class43;

public class Employee {
    String name;
    int age;

    public Employee() {
        super();
        name = "Omkar";
        age = 22;
    }

      public Employee(String name) {
        super();
        this.name = name;
        this.age = 22;
      }

      public Employee(int age) {
        super();
        this.name = "Omkar";
        this.age = age;
      }

      public Employee(String name, int age) {
        this.name = name;
        this.age = age;
      }
}
