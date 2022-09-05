package BitManipulation;

import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        int b = sc.nextInt();
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Swapped values are");
        System.out.println("a " + a);
        System.out.println("b " + b);
    }
}
