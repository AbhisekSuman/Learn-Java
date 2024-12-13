package Class47;

public class Student {

    String name;
    int age;

    class Address {
        int doorNo;
        int streetNo;
        String landmark;
        String city;
        String state;
        String country;
        int pin;

        public Address(int doorNo, int streetNo, String landmark, String city, String state, String country, int pin) {
            this.doorNo = doorNo;
            this.streetNo = streetNo;
            this.landmark = landmark;
            this.city = city;
            this.state = state;
            this.country = country;
            this.pin = pin;
        }

        void displayAddress() {
            System.out.println("Door no: " + doorNo + " Street No: " + streetNo + " Landmark: " + landmark + " City" +
                    city + " State: " + state + " Country: " + country + "PIN: " + pin);
        }
    }

    Address address;

    public Student() {

    }

    public void setData(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void printStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: ");
        address.displayAddress();
    }
}
