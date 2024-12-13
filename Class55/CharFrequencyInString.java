package Class55;

import java.util.Scanner;

public class CharFrequencyInString
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user for input
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            // Call method to count character frequencies
            int[] frequencyArray = countCharacterFrequency(input);

            // Display the character frequencies
            System.out.println("Character Frequencies:");
            for (int i = 0; i < frequencyArray.length; i++) {
                if (frequencyArray[i] > 0) {
                    System.out.println((char) i + ": " + frequencyArray[i]);
                }
            }

            scanner.close();
        }

        // Method to count the frequency of each character using an array
        private static int[] countCharacterFrequency(String str) {
            int[] frequencyArray = new int[256]; // ASCII character set size

            // Loop through each character in the string
            for (char ch : str.toCharArray()) {
                frequencyArray[ch]++; // Increment the corresponding index
            }

            return frequencyArray;
        }
}
