public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {22,13,14,1,7,8,56,34,22};
        LinSearch(arr, 22);
    }

    public static void LinSearch(int arr[], int val) {
        
        if(arr.length==0) {
            System.out.println("Array is empty!");
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            
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
