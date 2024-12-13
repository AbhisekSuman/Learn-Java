package Class64;

public class Queue {
    private final int size;
    private int f = -1;
    private int r = -1;
    int[] q;

    public Queue(int size) {
        this.size = size;
        q = new int[size];
        System.out.println("Queue of " + size + " created.");
    }

    public void insert(int elem) {
        if (r == size - 1) {
            System.out.println("Insertion not possible, Queue is full.");
        }
        else {
            ++r;
            q[r] = elem;
            System.out.println("Element " + elem + " inserted in to the queue.");
        }
    }

    public void delete() {
        if (f == size - 1 || r == -1) {
            System.out.println("Queue is empty Element can't delete");
        } else {
            ++f;
            System.out.println("Element deleted is " + q[f]);
            q[f] = 0;
        }
    }

    public void display() {
        if (r == -1 || f == size - 1) {
            System.out.println("Queue is empty. Nothing to display.");
        } else {
            for (int i: q) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
