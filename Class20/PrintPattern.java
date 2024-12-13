package Class20;

public class PrintPattern {
    public void printRightAngledCharacterPattern(int numberOfRows) {
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('A');
            }
            System.out.println();
        }
    }
}
