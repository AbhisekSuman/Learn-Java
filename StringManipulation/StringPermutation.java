package StringManipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringPermutation {

    
    // Convert a list of characters to a string
    private static String convertListToString(List<Character> list) {
        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            sb.append(c);
        }
        return sb.toString();
    }

    // Generate the next permutation in lexicographical order
    private static String getNextPermutation(List<Character> characters) {
        int n = characters.size();

        // Find the rightmost character smaller than its next character
        int i = n - 2;
        while (i >= 0 && characters.get(i) >= characters.get(i + 1)) {
            i--;
        }

        // If no such character is found, we are at the last permutation
        if (i < 0) {
            return null;
        }

        // Find the rightmost character larger than characters[i]
        int j = n - 1;
        while (characters.get(j) <= characters.get(i)) {
            j--;
        }

        // Swap characters[i] and characters[j]
        Collections.swap(characters, i, j);

        // Reverse the sequence after index i
        reverseList(characters, i + 1, n - 1);

        return convertListToString(characters);
    }

    // Reverse a sublist of characters
    private static void reverseList(List<Character> list, int start, int end) {
        while (start < end) {
            Collections.swap(list, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Generate and display permutations in lexicographical order
        System.out.println("Permutations of the string are:");
//        generatePermutations(input);

        scanner.close();
    }
}


