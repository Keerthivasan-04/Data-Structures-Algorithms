package Basics;

import java.util.Scanner;

public class RemoveDuplicate {

    private static int isDuplicate(int[] array) {

        if(array.length == 0)   return 0;

        int i = 0;
        for(int j = 1; j < array.length; j++){
            if(array[j] != array[i]){
                i++;
                array[i] = array[j];
            }
        }


        return i+1;
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
        int limit = isDuplicate(array);
        for(int i = 0; i < limit; i++){
            System.out.print(array[i] + " ");
        }
    }


}
