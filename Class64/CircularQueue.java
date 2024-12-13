package Class64;

public class CircularQueue {
    int front = -1;
    int rear = -1;
    int[] q;
    private int size;

    public CircularQueue(int size) {
        this.size = size;
        q = new int[size];
        System.out.println("Circular Queue created");
    }

    public void insert(int elem) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is full.");
            return;
        }
        if (front == -1) {
            front = 0;
            return;
        }
            rear = (rear + 1) % size;
            q[rear] = elem;
            System.out.println("Element inserted");
    }

    public void delete() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is empty.");
        } else if (rear == front) {
            int elem = q[front];
            System.out.println(elem + " deleted.");
            elem = 0;
            rear = -1;
            front = -1;
        }
        else {
            int elem = q[front];
            System.out.println(elem + " deleted.");
            front = (front + 1) % size;
        }
    }

    public void display() {
        for (int i: q) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
