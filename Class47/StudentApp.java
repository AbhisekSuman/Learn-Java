package Class47;

//Concept of Inner Class
public class StudentApp {
    public static void main(String[] args) {

        Student student = new Student();

        Student.Address address = student. new Address(123, 2, "Above Reliance Fresh", "Bengaluru",
                "Karnataka", "INDIA", 560076);

        student.setData("Omkar", 21, address);
        student.printStudentDetails();
    }
}
