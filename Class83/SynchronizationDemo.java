package Class83;

public class SynchronizationDemo {
    public static void main(String[] args) {
//        BathRoom bathRoom1 = new BathRoom();
//        BathRoom bathRoom2 = new BathRoom();
//        BathRoom bathRoom3 = new BathRoom();
//
//        bathRoom1.setName("BOY");
//        bathRoom2.setName("GIRL");
//        bathRoom3.setName("OTHER");
//
//        bathRoom1.start();
//        bathRoom2.start();
//        bathRoom3.start();

        BathRoom bathRoom = new BathRoom();

        Thread t1 = new Thread(bathRoom);
        Thread t2 = new Thread(bathRoom);
        Thread t3 = new Thread(bathRoom);

        t1.setName("BOY");
        t2.setName("GIRL");
        t3.setName("OTHER");

        t1.start();
        t2.start();
        t3.start();
    }
}
