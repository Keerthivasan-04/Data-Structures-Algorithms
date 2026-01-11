package Level_1;

import java.util.Scanner;

/**
 * Check if a string is a palindrome.
 */

public class PalindromicString {

    // --- Validation Method ---
    private static void validateInputString(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("Enter a valid string");
        }
    }

    // --- Business Method ---
    private static boolean checkPalindrome (String input){
        int left = 0;
        int right = input.length() - 1;

        while(left < right){
            if(input.charAt(left) != input.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String input = sc.nextLine();
        validateInputString(input);

        if(checkPalindrome(input)){
            System.out.println("It's a palindromic string");
        }
        else{
            System.out.println("It's not a palindromic string");
        }
    }
}
