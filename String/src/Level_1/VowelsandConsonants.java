package Level_1;

import java.util.Scanner;

/**
 * Count vowels and consonants.
 */

public class VowelsandConsonants {

    // --- Validation Method ---
    private static void validateInputString(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("Enter a valid string");
        }
    }

    // --- Business Method ---
    private static void checkVowelsandConsonants (String input){
        int vowelCount = 0;
        int consonantCount = 0;

        input = input.toLowerCase();

        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelCount++;
            }
            else if(ch >= 'a' && ch <= 'z'){
                consonantCount++;
            }
        }
        System.out.println("Vowels Count: " + vowelCount);
        System.out.println("Consonants Count: " + consonantCount);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String input = sc.nextLine();
        validateInputString(input);

        checkVowelsandConsonants(input);
    }
}
