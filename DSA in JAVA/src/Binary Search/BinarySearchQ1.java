//Ceiling of a number

public class BinarySearchQ1 {
    public static void main(String[] args) {
         int[] arr = {1,4,12,15,17,22,34,45,51,60,78,83,90};
         int target = 11;
         System.out.println(ceiling(arr, target));

    }

    public static int ceiling(int[] arr, int target) {
        if(target > arr[arr.length - 1]) {
            return -1;
        }
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
        return arr[start];
    }
}
