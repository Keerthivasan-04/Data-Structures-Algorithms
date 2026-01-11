package Level_2;

import java.util.Scanner;

/**
 * Count the frequency of a given element (without map)
 */

public class CountFrequency {

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
    private static void findFrequency(int[] arr, int target) {
        validateArray(arr);
        int frequency = 0;
        boolean istarget = false;

        for(int num : arr){
            if(num == target){
                istarget = true;
                frequency++;
            }
        }
        if(!istarget){
            System.out.println("Target element is not in the array");
        }
        else{
            System.out.println("The Frequency of the element " + target +" is: " + frequency);
        }
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

        System.out.println("Enter the element: ");
        int target = sc.nextInt();

        findFrequency(arr,target);
        //System.out.println("The Frequency of the " + target +" element is: "+ result);
    }
}
