package MathsBasics;

import java.util.Scanner;

//DIGITS IN FACTORIAL
public class Factorial_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int c = 0;
        Factorial factorial = new Factorial();
        System.out.println("factorial is " + factorial.fact(n));
        factorial.digits(c);
    }


}

class Factorial {
    long res = 1;

    public long fact(int n) {
        // int res = 1;

        for (int i = 2; i <= n; i++) {
            res = res * i;
        }
        return res;

    }

    public void digits(int c) {
        int count = 0;
        while (res != 0) {
            res = res / 10;
            count++;
        }
        System.out.println("number of digits are " + count);
    }
}
