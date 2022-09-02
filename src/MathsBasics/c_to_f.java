package MathsBasics;
//Convert Celsius To Fahrenheit

import java.util.Scanner;

public class c_to_f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your celcius temp");
        double c = sc.nextDouble();
        Solution2 solution2 = new Solution2();
        System.out.println("Fahrenhiet temp is " + solution2.ctof(c) + "^");

    }
}

class Solution2 {
    public double ctof(double C) {
        return (C * 1.8) + 32;
    }
}
