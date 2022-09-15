package Recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(fac(a));
    }

    static int fac(int n) {
        if (n == 0)
            return 1;
        int partialAns = fac(n - 1);
        return n * partialAns;
    }
}
