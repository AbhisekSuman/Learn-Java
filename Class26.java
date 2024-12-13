import java.util.Scanner;

public class Class26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Series series = new Series();

//        System.out.println("Enter a number: ");
//        int maxNum = scanner.nextInt();
//        System.out.println("N th term of this is: " + series.nThTermOfSeries2(maxNum));
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * ((double) 5 / 9);
        System.out.println(celsius);
    }
}

class Series {
    public int nThTermOfSeries1(int n) {
        int i = 1;
        int j = 2;

        while (j <= n) {
            i += j;
            j++;
        }
        return i;
    }
    public int nThTermOfSeries2(int n) {
        return (n * (n + 1)) / 2;
    }
}
