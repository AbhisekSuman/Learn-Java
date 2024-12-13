package Class20;

public class Patern37 {
    public static void main(String[] args) {
        int row = 10;
        for (int i = 2; i <= row*2; i+=2) {
            for (int j = 2; j < i; j+=2) {
                System.out.print(" ");
            }
            for (int j = row*2; j >= i; j--) {
                if (j == row*2 || j == i)
                    System.out.print(i/2);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = row*2; i >= 2; i-=2) {
            for (int j = 2; j < i; j+=2) {
                System.out.print("*");
            }
//            for (int j = row*2; j >= i; j--) {
//                if (j == row*2 || j == i)
//                    System.out.print(i/2);
//                else
//                    System.out.print(" ");
//            }
            System.out.println();
        }
    }
}
