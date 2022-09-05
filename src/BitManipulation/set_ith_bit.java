package BitManipulation;

public class set_ith_bit {
    public static void main(String[] args) {
        int n = 10; //1010
        int k = 2;
        System.out.println( "kth bit set number " + setKBit(n,k));
    }

    static int setKBit(int n, int k) {
        return ((1 << k) | n);
    }
}
