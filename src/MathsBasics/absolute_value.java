package MathsBasics;
//Absolute value of a number
import java.util.Scanner;

public class absolute_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        Solution sol = new Solution();
        System.out.println("Absolute value is = " + sol.absolute(a));

    }
}

class Solution {
    public int absolute(int I) {
        // code here
        if (I < 0) {
            I = I * -1;
        }
        return I;
    }
}