package Class81;

public class MultithreadingRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Login());
        Thread t2 = new Thread(new Print());
        Thread t3 = new Thread(new Addition());

        t1.start();
        t2.start();
        t3.start();
    }
}
