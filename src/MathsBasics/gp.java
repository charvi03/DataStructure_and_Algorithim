package MathsBasics;

import java.util.Scanner;

//gp term
public class gp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st term");
        int a= sc.nextInt();
        System.out.println("Enter 2nd term");
        int b= sc.nextInt();
        System.out.println("Enter total number of terms");
        int n=sc.nextInt();
        System.out.println(gpTerm(a,b,n));

    }
    static double gpTerm(int a,int b , int n){
        int r= b/a;
       double last=a*(Math.pow(r,(n-1)));
       return last;
    }
}
