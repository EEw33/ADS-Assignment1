import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("task 1:" + sumOfSquares(n));
        System.out.println("task 2:" + sumOfFirst(n));

        System.out.println("For task 3, please, input two values:");
        int b = scanner.nextInt();
        n = scanner.nextInt();
        System.out.println("task 3:" + sumOfPowers(b,n));
    }


    //task1
    public static int sumOfSquares(int n) {
        if(n==1) return 1;
        return n*n+sumOfSquares(n-1);
    }


    //task2
    public static int sumOfFirst(int n){
        if(n==1) return 1;
        return n+sumOfFirst(n-1);
    }


    //task3
    public static int sumOfPowers(int b, int n){
        if(n==0) return 1;
        return pow(b,n)+sumOfPowers(b,n-1);
    }
    private static int pow(int a, int b) {
        if (b == 0) return 1;
        return a * pow(a, b - 1);
    }
}