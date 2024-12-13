package Class45.Package1;

public class Demo2 {
    Demo1 d = new Demo1();
    void display() {
        System.out.println(d.a);
        System.out.println(d.b);
        System.out.println(d.c);
//        System.out.println(d.d); d' has private access in 'Class45.Package1.Demo1'
    }
}
