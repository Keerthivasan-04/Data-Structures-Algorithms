package Level_1;

import java.util.Scanner;

/**
 * Reverse a string.
 */

public class ReverseString {

    // --- Validation Method ---
    private static void validateInputString(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("Enter a valid string");
        }
    }

    // --- Business Method ---
    private static String reverse (String input){
        StringBuilder result = new StringBuilder();
        for(int i = input.length() - 1; i >= 0; i--){
            result.append(input.charAt(i));
        }
        return result.toString();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String input = sc.nextLine();
        validateInputString(input);

        String result = reverse(input);
        System.out.println("Reversed String is : " + result);
    }
}
