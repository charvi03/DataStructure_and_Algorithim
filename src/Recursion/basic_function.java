package Recursion;

public class basic_function {
    public static void main(String[] args) {
        recur(10);

    }
    static void recur(int n){
        if (n==0){
            return ;
        }
        System.out.println("hello");
        recur(n-1);
    }
}
