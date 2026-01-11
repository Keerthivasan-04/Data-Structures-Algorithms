package Sorting;
import java.util.*;

public class SelectionSort {
    public static void selectionsort(int[] arr, int n) {
        int minimum = 0;
        for(int i = 0; i <= n - 2; i++){
            minimum = i;
            for(int j = i; j <= n - 1; j++){
                if(arr[j] < arr[minimum]){
                    minimum = j;
                }
            }
            int temp = arr[minimum];
            arr[minimum] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        selectionsort(arr,n);
        System.out.println("Sorted Array: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
