package BitManipulation;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number ");
        int a= sc.nextInt();
        if ((a&1)==0){
            System.out.println("no is even");
        }
        else {
            System.out.println("no is odd");
        }
    }
}
