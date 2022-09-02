package MathsBasics;

public class power {
    public static void main(String[] args) {
        System.out.println("the power " + fastPower(3, 5));
    }

    static long fastPower(long a, long b) { // int n
        long res = 1;
        while (b > 0) {
            if (b % 2 != 0) {
                // res = (res * a % n) % n;     ---res%n * a%n
                res = res * a;
            }
            a = a * a;
            //  a = (a % n * a % n) % n;
            b = b / 2;

        }
        return res;
    }
}
