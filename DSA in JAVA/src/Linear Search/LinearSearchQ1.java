//Search in string

import java.util.*;
public class LinearSearchQ1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String name = scan.nextLine();

        System.out.println("Enter the string to search : ");
        char target = scan.next().charAt(0);
        
        System.out.println("Result = "+search(name, target));

    }

    public static boolean search(String name, char target) {
        if(name.length() == 0) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if(target == name.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
