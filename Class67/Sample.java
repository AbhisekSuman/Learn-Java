package Class67;

public class Sample<T> {
    T i;

    public void setData(T i) {
        this.i = i;
    }

    public void display() {
        System.out.println(i);
    }

    public <L> void sampling(L a) {
        System.out.println(a);
    }
}
