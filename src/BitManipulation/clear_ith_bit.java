package BitManipulation;

public class clear_ith_bit {
    public static void main(String[] args) {
        int n = 5;//101
        int k = 1;
        System.out.println(clearKBit(n, k));
    }

    static int clearKBit(int n, int k) {
        int mask = ~(1 << k-1);
        int res = n & mask;
        return res;
    }
}
