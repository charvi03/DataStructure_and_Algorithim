package MathsBasics;

import java.util.Arrays;
import java.util.Scanner;

//Exactly 3 divisors
public class divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        With3Divisors(n);
    }

    static void With3Divisors(int n) {
        int count = 0;
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        // all prime no. upto given number
        for (int i = 2; i * i <= n; i++) {
            for (int j = 2 * i; j <= n; j = j + i) {
                prime[j] = false;
            }
        }

        System.out.println("Numbers with 3 divisors : ");
        for (int i = 0; i * i <= n; i++) {
            if (prime[i]) {
                System.out.print(i * i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.print("total numbers " + count);
    }


}
