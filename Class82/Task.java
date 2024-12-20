package Class82;

public class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("kodnest");
        try {
            Thread.sleep(10000);
            System.out.println("After wake up");
        } catch (Exception e) {
            System.out.println("Thread is dead now...");
            e.printStackTrace();
        }
    }
}
