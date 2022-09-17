package Recursion;

import java.util.Scanner;

// NTH FIBONACCI NUMBER
public class fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nth term");
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }

    static int fibo(int n) {
        if (n == 1 || n == 2) return 1;
        return fibo(n - 1) + fibo(n - 2);
    }
}
