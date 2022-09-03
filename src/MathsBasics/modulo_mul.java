package MathsBasics;
//Multiplication in modulo
public class modulo_mul {
    public static void main(String[] args) {
        long a = 92233720368547758L;
        long b = 92233720368547758L;
        System.out.println(mMul(a, b));
    }
    static long mMul(long a, long b) {
        long m = 1000000007;
        return ((a % m) * (b % m)) % m;
    }
}
