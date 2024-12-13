package Class45.Package1;

public class Demo3 extends Demo1{
    @Override
    void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
//        System.out.println(d);    d' has private access in 'Class45.Package1.Demo1'
    }
}
