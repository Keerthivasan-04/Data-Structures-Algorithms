package Level_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Shift all negative numbers to the left
 */

public class NegativetoLeft {

    // --- Validation methods ---
    private static void validateInputSize(int size) {
        if(size < 0){
            throw new IllegalArgumentException("Array size must be positive");
        }
        if(size == 0){
            throw new IllegalArgumentException("Array size must be greater than zero");
        }
    }

    private static void validateArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
    }

    // --- Business Methods ---
    private static void displayArray(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void moveNegativetoLeft_ExtraSpace(int[] arr, int size) {
        /**
         * Time COmplexity : O(n)
         * Space Complexity : O(n)
         */

        validateArray(arr);
        List<Integer> negativeNumber = new ArrayList<>();
        List<Integer> positiveNumber = new ArrayList<>();

        for(int i = 0; i < size; i++){
            if(arr[i] < 0){
                negativeNumber.add(arr[i]);
            }
            else{
                positiveNumber.add(arr[i]);
            }
        }

        for(int i = 0; i < negativeNumber.size(); i++){
            arr[i] = negativeNumber.get(i);
        }
        int j = 0;
        for(int i = negativeNumber.size(); i < arr.length; i++){
            arr[i] = positiveNumber.get(j);
            j++;
        }

        System.out.println("Move negative elements to left - Extra Space: ");
        displayArray(arr);
    }

    private static void moveNegativetoLeft_ExtraTime(int[] arr, int size) {
        /**
         * Time COmplexity : O(n^2)
         * Space Complexity : O(1)
         */

        int pos = 0;

        for(int i = 0; i < size; i++){
            if(arr[i] < 0){
                int temp = arr[i];
                int j = i;

                while(j > pos){
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[pos] = temp;
                pos++;
            }
        }

        System.out.println("Move negative elements to left - Extra Time: ");
        displayArray(arr);

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array size: ");

        int size = sc.nextInt();
        validateInputSize(size);

        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        moveNegativetoLeft_ExtraSpace(arr,size);
        moveNegativetoLeft_ExtraTime(arr,size);
    }
}
