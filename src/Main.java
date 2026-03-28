import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        System.out.println("task 1: " + sumOfSquares(n));


        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = i+1;
        }
        System.out.println("task 2: " + sumOfFirst(arr, n));

        System.out.println("For task 3, please, input two values:");
        int b = scanner.nextInt();
        n = scanner.nextInt();
        System.out.println("task 3: " + sumOfPowers(b,n));

        System.out.println("Task 4 input:");
        n = scanner.nextInt();
        reverse(n);
    }


    //task1
    public static int sumOfSquares(int n) {
        if(n==1) return 1;
        return n*n+sumOfSquares(n-1);
    }


    //task2
    public static int sumOfFirst(int[] array, int n){
        if(n==1) return 1;
        return array[n-1]+sumOfFirst(array,n-1);
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


    //task4
    public static void reverse(int n){
        if(n==0) return;
        int container = scanner.nextInt();
        reverse(n-1);
        System.out.print(container+" ");
    }
}