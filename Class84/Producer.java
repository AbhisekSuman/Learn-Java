package Class84;

public class Producer extends Thread {
    Factory ref;

    public Producer(Factory ref) {
        this.ref = ref;
    }

    @Override
    public void run() {
        int x = 1;
        while (true) {
            ref.produceData(++x);
        }
    }
}
