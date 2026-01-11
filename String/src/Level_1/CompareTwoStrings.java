package Level_1;

import java.util.Scanner;

/**
 * Compare two strings without using built-in functions.
 *
 */

public class CompareTwoStrings {

    // --- Validation Method ---
    private static void validateInputString(String input1, String input2) {
        if (input1 == null || input2 == null) {
            throw new IllegalArgumentException("String cannot be null");
        }
    }

    // --- Business Method ---
    private static boolean compareStrings (String input1, String input2){

        if(input1.length() != input2.length()){
            return false;
        }
        for (int i = 0; i < input1.length(); i++) {
            if (input1.charAt(i) != input2.charAt(i)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String1: ");
        String input1 = sc.nextLine();

        System.out.println("Enter the String2: ");
        String input2 = sc.nextLine();

        validateInputString(input1,input2);

        if(!compareStrings(input1,input2)){
            System.out.println("Strings are not equal");
        }
        else{
            System.out.println("Strings are equal");
        }
    }
}
