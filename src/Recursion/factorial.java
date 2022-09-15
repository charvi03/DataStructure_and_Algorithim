package Recursion;

public class factorial {
    public static void main(String[] args) {
        System.out.println(fac(5));
    }

    static int fac(int n) {
        if (n == 0)
            return 1;
        int partialans = fac(n - 1);
        return n * partialans;
    }
}
