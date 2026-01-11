package Level_1;

import java.util.Scanner;

/**
 * Remove duplicates from a string.
 */

public class RemoveDuplicates {

    // --- Validation Method ---
    private static void validateInputString(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("Enter a valid string");
        }
    }

    // --- Business Method ---
    private static void removeDuplicate (String input){

        input = input.toLowerCase();
        int[] freq = new int[26];
        StringBuilder result = new StringBuilder();


        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (!Character.isLetter(ch)) {
                throw new IllegalArgumentException("String must contain only letters a-z");
            }
            if(freq[ch - 'a'] < 1){
                freq[ch - 'a']++;
                result.append(ch);
            }

        }
        System.out.println("Original String: " + input);
        System.out.println("Duplicate removed String: " + result.toString());
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String input = sc.nextLine();
        validateInputString(input);

        removeDuplicate(input);
    }
}
