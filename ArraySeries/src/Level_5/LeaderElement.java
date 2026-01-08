package Level_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Find the leader elements in an array
 */

public class LeaderElement {

    // --- Validation methods ---
    private static void validateInputSize(int size) {
        if(size <= 0){
            throw new IllegalArgumentException("Array size must be greater than zero");
        }
    }

    private static void validateArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
    }

    // --- Business Methods ---
    private static void findLeaderElement(int[] arr, int size) {
        validateArray(arr);

        ArrayList<Integer> leaders = new ArrayList<>();

        int currentRightMax = arr[size - 1];
        leaders.add(currentRightMax);

        for(int i = size - 2; i >= 0; i--){
            if(arr[i] > currentRightMax){
                leaders.add(arr[i]);
                currentRightMax = arr[i];
            }
        }

        System.out.println("Leader elements are: ");
        for(int i = leaders.size() - 1; i >= 0; i--){
            System.out.print(leaders.get(i) + " ");
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
        findLeaderElement(arr,size);
    }
}
