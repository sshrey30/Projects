//Search in range

public class LinearSearchQ2 {
    public static void main(String[] args) {
        int[] arr = {22,13,14,1,7,8,56,34,22};
        LinSearch(arr, 22,2,6);
    }

    public static void LinSearch(int arr[], int val, int start, int end) {
        
        if(arr.length==0) {
            System.out.println("Array is empty!");
        }

        int count = 0;

        for (int i = start; i <= end; i++) {
            
            if(arr[i] == val) {
                count++;
            }
        }
        if(count!=0)
            System.out.println("Element found!");
        else
            System.out.println("Element not found!");
        
    }
}
