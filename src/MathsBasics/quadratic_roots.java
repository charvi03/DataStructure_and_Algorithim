package MathsBasics;

import java.util.Scanner;

//Quadratic roots of equation
public class quadratic_roots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        int b = sc.nextInt();
        System.out.println("Enter value of c");
        int c = sc.nextInt();
        quad(a,b,c);
    }
    static void quad(int a, int b, int c) {
        double root1 ,root2;
        double determinant = (b*b)-(4*a*c);
        double sqrt =Math.sqrt(determinant);

        if (determinant > 0) {
            root1=  (-b + sqrt) / 2 * a;
            root2=  (-b -sqrt) / 2 * a;
            System.out.println("Roots are :: "+ root1 + " & " + root2);

        } else if (determinant == 0) {
            System.out.println("Root is ::"+(-b + sqrt) / (2 * a));
        } else {
            System.out.println("Roots are imaginary");
        }
    }
}


