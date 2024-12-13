package Class45.Package2;

import Class45.Package1.Demo1;

public class Demo4 {
    Demo1 d = new Demo1();
    void display() {
        System.out.println(d.a);
//        System.out.println(d.b);  'b' has protected access in 'Class45.Package1.Demo1'
//        System.out.println(d.c);  'c' is not public in 'Class45.Package1.Demo1'. Cannot be accessed from outside package
//        System.out.println(d.d);  'd' has private access in 'Class45.Package1.Demo1'
    }
}
