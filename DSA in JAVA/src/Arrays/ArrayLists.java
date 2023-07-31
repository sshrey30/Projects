import java.util.*;
public class ArrayLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

        
        
       

        for (int i = 0; i < 5; i++) {
            list.add(scan.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)+" ");
        }
        
        
    }
}
