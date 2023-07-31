// Search in 2D Arrays
import java.util.*;
public class LinearSearchQ3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of rows : ");
        int rows = scan.nextInt();

        System.out.print("Enter the number of columns : ");
        int cols = scan.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element ("+(i+1)+","+(j+1)+") : ");
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("Array : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //Searching in 2D Array

        System.out.println("Enter the target : ");
        int target = scan.nextInt();
        int[] ans = search(rows, cols, arr, target);
        System.out.println(Arrays.toString(ans));

        System.out.println(min(rows, cols, arr));
        System.out.println(max(rows, cols, arr));
    }

    public static int[] search(int rows, int cols, int arr[][], int target) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(arr[i][j] == target) {
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[] {-1,-1};
    }

    public static int min(int rows, int cols, int arr[][]) {
        int min = arr[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(arr[i][j]<min) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }

    public static int max(int rows, int cols, int arr[][]) {
        int max = arr[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(arr[i][j]>max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
