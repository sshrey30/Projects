import java.util.*;

public class Array {
    public static void main(String[] args) {
        int[] arr = {3,6,1,8,9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        /*2D Array*/

        //int[][] arr2d = new int[3][3];

        int[][] arr2d = {{1,2,3},{4,5,6},{7,8,9}};
        
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d.length; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }

}
