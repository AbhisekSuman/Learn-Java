package Class67;

public class SampleApp {
    public static void main(String[] args) {
        Sample<Integer> sample1 = new Sample<Integer>();
        sample1.setData(100);
        sample1.display();

        Sample<String> sample2 = new Sample<String>();
        sample2.setData("Ramu");
        sample2.display();

        sample1.sampling(100);
        sample1.sampling("ABCD");
        sample2.sampling(true);
    }
}
