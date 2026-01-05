package Basics;

import java.util.Scanner;

/**
 * This class is responsible finding the second-largest and second-smallest number in the array
 */
public class SecondLargestandSmallest {

    private static void secondLarge(int[] array) {
        if (array.length < 2) {
            System.out.println("Array must contain at least two elements");
            return;
        }

        int large = Integer.MIN_VALUE;
        int secLarge = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > large) {
                secLarge = large;
                large = array[i];
            }
            else if (array[i] > secLarge && array[i] != large) {
                secLarge = array[i];
            }
        }

        if (secLarge == Integer.MIN_VALUE) {
            System.out.println("Second largest element does not exist");
        } else {
            System.out.println("Second largest element is: " + secLarge);
        }
    }

    private static void secondSmall(int[] array) {
        if (array.length < 2) {
            System.out.println("Array must contain at least two elements");
            return;
        }

        int small = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < small) {
                secSmall = small;
                small = array[i];
            }
            else if (array[i] < secSmall && array[i] != small) {
                secSmall = array[i];
            }
        }

        if (secSmall == Integer.MAX_VALUE) {
            System.out.println("Second smallest element does not exist");
        } else {
            System.out.println("Second smallest element is: " + secSmall);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the numbers: ");
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        secondSmall(array);
        secondLarge(array);
    }


}
