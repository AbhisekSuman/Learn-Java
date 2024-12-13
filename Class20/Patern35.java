package Class20;

import java.util.Scanner;

public class Patern35 {
    public static void main(String[] args) {
        // Instantiate Scanner
        Scanner scanner = new Scanner(System.in);

        //Take number of rows as input
        System.out.println("Enter Number of Rows: ");
        int numberOfRows = scanner.nextInt();

        //Call printRightAngledCharacterPattern function
        PrintPattern printPattern = new PrintPattern();
        printPattern.printRightAngledCharacterPattern(numberOfRows);

        //Print End of Pattern
        System.out.print("End of Pattern");
    }
}

