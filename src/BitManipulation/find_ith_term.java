package BitManipulation;

import java.util.Scanner;

public class find_ith_term {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        System.out.println("Enter the bit u want to find");
        int k = sc.nextInt();
        kBit(n,k);

    }

    static void kBit(int n, int k) {
        if ((n & (1 << (k - 1))) != 0) {
            System.out.println("Yes , bit is 1");
        } else {
            System.out.println("No bit is zero" );
        }
    }

}
