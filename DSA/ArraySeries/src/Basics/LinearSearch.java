package Basics;

import java.util.Scanner;

public class LinearSearch {

    private static void lsearch(int[] arr, int size, int target) {
        boolean isPresent = false;

        for(int i = 0; i < size; i++){
            if(arr[i] == target) {
                System.out.println(i);
                isPresent = true;
            }
        }
        if(!isPresent){
            System.out.println("Target is not present");
        }



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Array Element: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search: ");
        int target = sc.nextInt();
        lsearch(arr,size,target);
    }


}
