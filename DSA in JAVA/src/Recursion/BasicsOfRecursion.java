package Recursion;

public class BasicsOfRecursion {
    public static void main(String[] args) {
        // Nto1(10);
        // OneToN(10);
        // System.out.println(factorial(5));
        // System.out.println(sumOfDigits(541));
        System.out.println(productOfDigits(541));


    }

    public static void Nto1(int n) {
        if(n==0) {
            return;
        }

        System.out.println(n);
        Nto1(n-1);
    }

    public static void OneToN(int n) {
        if(n==0) {
            return;
        }
        OneToN(n-1);
        System.out.println(n);
    }

    public static int factorial(int n) {
        if(n<=1) {
            return 1;
        }

        return n*factorial(n-1);
    }

    public static int sumOfDigits(int n) {
        if(n==0) {
            return n;
        }

        return (n%10)+sumOfDigits(n/10);
    }

    public static int productOfDigits(int n) {
        if(n%10==n) {
            return n;
        }

        return (n%10)*productOfDigits(n/10);
    }
}
