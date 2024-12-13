package Class63;

public class Array {
    private int[] arr;
    private int size = 0;

    public Array(int size) {
        this.size = size;
        arr = new int[size];
        System.out.println("Array of size " + size + " got created.");
    }

    public void insert(int elem, int pos) {
        if (pos >= 0 && pos <= size - 1) {
            arr[pos] = elem;
            System.out.println("Element Inserted Successfully");
        }
        else {
            System.out.println("Position not allowed");
        }
    }

    public void delete(int pos) {
        if (pos >= 0 && pos <= size - 1) {
            System.out.println(arr[pos] + " Deleted Successfully.");
            arr[pos] = 0;
        }
        else {
            System.out.println("Position not allowed");
        }
    }

    public int get(int pos) {
        if (pos >= 0 && pos <= size - 1) {
            return arr[pos];
        }
        else {
            System.out.println("Position Not Allowed");
            return -1;
        }
    }

    public void display() {
        if (size > 0) {
            for (int i: arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        else {
            System.out.println("Array not exist");
        }
    }
}
