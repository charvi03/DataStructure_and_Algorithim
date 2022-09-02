package MathsBasics;

public class count {
    public static void main(String[] args) {

       count(10);
    }
    static void count(int n){
        if (n==0){
            return ;
        }
        count(n-1);
        System.out.print(n + " ");
    }
}
