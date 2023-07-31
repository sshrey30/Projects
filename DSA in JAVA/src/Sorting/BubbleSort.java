package Sorting;

import java.util.Arrays;

//Bubble Sort sorts the array by adjacent comparisons
//Best Case O(N) - Array is sorted
//Worst Case O(N^2) - Array is oppositely sorted

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,6,3,9,7};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
