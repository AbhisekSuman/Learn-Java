package Class84;

public class Factory {
    int x;
    boolean isDataPresent = false;

    synchronized void produceData(int i) {
        try {
            if (isDataPresent) {
                wait();
            }
            x = i;
            System.out.println("Data " + x + " produced.");
            isDataPresent = true;
            notify();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized void consumeData() {
        try {
            if (!isDataPresent) {
                wait();
            }
            System.out.println("Data " + x + " is consumed.");
            isDataPresent = false;
            notify();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
