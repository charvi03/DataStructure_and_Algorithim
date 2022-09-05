package BitManipulation;
//find number of bots change to convert A into b

public class changing_bits {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(flipCount(a,b));

    }

    static int countBits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n &= n - 1;
        }
        return count;
    }
    static int flipCount(int a , int b){
        return countBits(a^b);
    }
}
