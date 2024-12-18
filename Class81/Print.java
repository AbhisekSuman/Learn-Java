package Class81;

public class Print implements Runnable{
    @Override
    public void run() {
     print();
    }

    void print() {
        try {
            System.out.println("Printing Activity started..");
            for (int i = 0; i < 5; i++) {
                System.out.println("Kodnest");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Printing Activity ended.");
    }
}
