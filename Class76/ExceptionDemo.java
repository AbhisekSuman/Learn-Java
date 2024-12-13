package Class76;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 0;

        try {
            System.out.println("Enter 2 numbers for division: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            int div = a / b;
            System.out.println("Division Result is: " + div);

            System.out.println("Enter array length: ");
            size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Array of size " + size + " got created.");

            System.out.println("Enter the element and index to store it in array: ");
            int elem = sc.nextInt();
            int pos = sc.nextInt();

            arr[pos] = elem;
            System.out.println("Element in the position " + pos + " is " + elem);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException : / by 0(Zero) at line 15");
        } catch (NegativeArraySizeException e) {
            System.out.println("NegativeArraySizeException : give a positive array size at line 21");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException : enter the position in between 0 to " + size);
        } catch (Exception e) {
            System.out.println("Some Other issue " + e);
        }

        System.out.println("CONNECTION TERMINATED");
    }
}
