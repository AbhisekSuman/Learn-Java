package Class45.Package2;

import Class45.Package1.Demo1;

public class Demo5 extends Demo1 {
    void display() {
        System.out.println(a);
        System.out.println(b);
//        System.out.println(c);    'c' is not public in 'Class45.Package1.Demo1'. Cannot be accessed from outside package
//        System.out.println(d);    'd' has private access in 'Class45.Package1.Demo1'
    }
}
