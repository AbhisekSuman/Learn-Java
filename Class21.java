import java.util.Scanner;

public class Class21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SumOfSqure sumOfSqure = new SumOfSqure();
        sumOfSqure.printSumOfSquare(scanner.nextInt());
    }
}

class SumOfSqure {
    void  printSumOfSquare (int n) {
        int sum = 1;
        for (int i = 2; i <= n; i++) {
            sum = sum + (i*i);
        }
        System.out.println(sum);
    }

}
