package Level_1;

import java.util.Scanner;

/**
 * Convert uppercase to lowercase and vice versa.
 *
 * I/P : "HelloWorld"
 * O/P : "hELLOwORLD"
 *
 */

public class UpperLowerConverter {

    // --- Validation Method ---
    private static void validateInputString(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("Enter a valid string");
        }
    }

    // --- Business Method ---
    private static void toggleCase (String input){
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                char upper = (char)(ch - ('a' - 'A'));
                result.append(upper);
            }
            else if(ch >= 'A' && ch <= 'Z'){
                char lower = (char)(ch + ('a' - 'A'));
                result.append(lower);
            }
            else{
                result.append(ch);
            }
        }
        System.out.println("Converted String: " + result);
    }

    private static void toggleCaseXOR(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Only toggle alphabetic characters
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                ch = (char)(ch ^ 32);  // XOR toggles case
                result.append(ch);
            }
        }

        System.out.println("XOR Output: " + result);
    }

    private static void toggleCaseTwoPointer(String input) {
        char[] arr = input.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            // left pointer conversion
            if (arr[left] >= 'a' && arr[left] <= 'z') {
                arr[left] = (char)(arr[left] - 32);   // to uppercase
            } else if (arr[left] >= 'A' && arr[left] <= 'Z') {
                arr[left] = (char)(arr[left] + 32);   // to lowercase
            }

            // right pointer conversion
            if (arr[right] >= 'a' && arr[right] <= 'z') {
                arr[right] = (char)(arr[right] - 32);
            } else if (arr[right] >= 'A' && arr[right] <= 'Z') {
                arr[right] = (char)(arr[right] + 32);
            }

            left++;
            right--;
        }

        System.out.println("Two Pointer Output: " + new String(arr));
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String input = sc.nextLine();
        validateInputString(input);

        toggleCase(input);
        toggleCaseXOR(input);
        toggleCaseTwoPointer(input);
    }

}
