package Sorting;

import java.util.Arrays;

//Cyclic Sort works only for continous array (in range 1 .... N)
//Whenever find array in range 1....N use cyclic sort
// All cases O(N)


public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,5,2,1,3,6};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct_index = arr[i] - 1;
            if(arr[i] != arr[correct_index]) {
                swap(arr, i, correct_index);
            }
            else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}
