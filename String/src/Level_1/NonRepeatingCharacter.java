package Level_1;

import java.util.Scanner;

/**
 * Find the first non-repeating character.
 */

public class NonRepeatingCharacter {

    // --- Validation Method ---
    private static void validateInputString(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("Enter a valid string");
        }
    }

    // --- Business Method ---
    private static void checkFirstNonRepeat (String input){

        input = input.toLowerCase();
        int[] freq = new int[26];

        // Count frequencies
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (!Character.isLetter(ch)) {
                throw new IllegalArgumentException("String must contain only letters a-z");
            }

            freq[ch - 'a']++;
        }

        // Find first non-repeating
        boolean found = false;
        char resultChar = ' ';

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (freq[ch - 'a'] == 1) {
                resultChar = ch;
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating character found");
        } else {
            System.out.println("First Non Repeating Character: " + resultChar);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String input = sc.nextLine();
        validateInputString(input);

        checkFirstNonRepeat(input);
    }
}
