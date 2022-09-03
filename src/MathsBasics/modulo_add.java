package MathsBasics;

//Addition under modulo
public class modulo_add {
    public static void main(String[] args) {
        long a = 9223372036854775807L;
        long b = 9223372036854775807L;
        System.out.println(mAdd(a, b));
    }

    static long mAdd(long a, long b) {
        long m = 1000000007;
        return (a % m + b % m) % m;
    }
}
