package Class83;

public class BathRoom implements Runnable {
    @Override
    synchronized public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " IS ENTERING BATHROOM.");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " IS USING BATHROOM.");
            Thread.sleep(4900);
            System.out.println(Thread.currentThread().getName() + " IS EXITING BATHROOM.");
            Thread.sleep(4800);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
