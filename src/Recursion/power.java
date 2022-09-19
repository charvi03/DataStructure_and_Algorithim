package Recursion;

//power of nth number
public class power {
    public static void main(String[] args) {
        Pow(3, 5);

    }

    static long Pow(int X, int N) {
        //pow(x,n) = x* pow(x,n-1)
        long temp = Pow(X, N / 2);
        if (N % 2 == 1) return temp * temp * X;
        return temp * temp;
    }
}
