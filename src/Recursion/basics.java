package Recursion;

public class basics {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n ){
        if (n==5){ // base condition
            System.out.println(5);
            return; //return to main func call
        }
        System.out.println(n);
        //recursive call
        print(n+1);
    }
}
