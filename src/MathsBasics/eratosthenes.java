package MathsBasics;

import java.util.Arrays;
import java.util.Scanner;

public class eratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till u want primes");
        int a= sc.nextInt();
        boolean isPrime[]= sieve(a);
        for (int i=0;i<=a;i++){
            System.out.println(i + " " + isPrime[i]);
        }

    }
    static  boolean[] sieve(int n){
        boolean isPrime[]=new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for (int i=2;i*i<=n;i++){
            for (int j=2*i;j<=n;j=j+i){
                isPrime[j]=false;
            }
        }
        return isPrime;
    }
}
