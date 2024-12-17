package Class80;

public class MultithreadingIntro {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Thread th = new Thread();

        System.out.println(th);
        th.setName("Abhi");
        th.setPriority(3);
        System.out.println(th);
    }
}
