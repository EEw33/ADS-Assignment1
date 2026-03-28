import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sumOfSquares(n));
    }
    public static int sumOfSquares(int n) {
        if(n==1) return 1;
        return n*n+sumOfSquares(n-1);
    }
}