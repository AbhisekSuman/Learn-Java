package Class82;

public class RaceConditionApp {
    public static void main(String[] args) {
        MSWord msWord = new MSWord();
        Thread t1 = new Thread(msWord);
        Thread t2 = new Thread(msWord);
        Thread t3 = new Thread(msWord);

        t1.setName("typing");
        t2.setName("spell");
        t3.setName("save");

        t2.setDaemon(true);
        t3.setDaemon(true);

        t2.setPriority(8);
        t2.setPriority(6);

        Thread.yield();
        t1.start();
        t2.start();
        t3.start();
    }
}
