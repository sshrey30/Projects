import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {22,12,1,4,15,-5,-8,45,78,90,17}; 
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int target = -5;
        System.out.println(binarySearch(arr, target));
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            }
            else if(target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
