package Class63;

public class Stack {
    private int top;
    private int size;
    int[] stack;

    public Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
        System.out.println("Stack created.");
    }

    public void push(int elem) {
        if (top < size - 1) {
            ++top;
            stack[top] = elem;
            System.out.println("Element inserted.");
        }
        else {
            System.out.println("Stack full");
        }
    }

    public void pop() {
        if (top >= 0) {
            stack[top] = 0;
            --top;
            System.out.println("Element deleted");
        }
        else {
            System.out.println("Stack is empty");
        }
    }

    public void  display() {
        for (int i: stack) {
            System.out.print(i + " ");
        }
    }
}
