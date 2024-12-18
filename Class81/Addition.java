package Class81;

public class Addition implements Runnable {

    @Override
    public void run() {
        add();
    }

    void add() {
        try {
            System.out.println("Addition Activity started..");
            long l1 = 2147483649L;
            long l2 = 6444613L;
            long sum = l1 + l2;
            Thread.sleep(5000);
            System.out.println("Addition result is: " + sum);
            System.out.println("Addition Activity is ended.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
