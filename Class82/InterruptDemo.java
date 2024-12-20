package Class82;

public class InterruptDemo {
    public static void main(String[] args) {
        try {
            Task task = new Task();

            Thread t1 = new Thread(task);
            t1.start();
            Thread.currentThread().sleep(2000);
            t1.interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
