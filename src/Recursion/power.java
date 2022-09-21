package Recursion;

//power of nth number
public class power {
    public static void main(String[] args) {
        System.out.println(Pow(2, 3));

    }

    static long Pow(int value, int power) {
        if (power == 0) return 1;
        long ans = Pow(value, power - 1);//3 //2 //1 //0
        return value * ans;
    }


    static long Pow2(int value, int power) {
        //pow(x,n) = x* pow(x,n-1)
        if(power==0)return 1;
        long temp = Pow2(value, power / 2);//v2 p 4 (2,4)
        if (power % 2 == 1) return temp * temp * value; //when it is odd....return   --- 1*1*2=2 --
        return temp * temp; //when it is even --2*2=4  -- 4*4 ==16
    }
}
