package Recursion;

public class sum_of_n {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    static int sum(int n) {
        if (n == 1) return 1;
        int partialans = sum(n - 1);
        return n + partialans;

    }
}
