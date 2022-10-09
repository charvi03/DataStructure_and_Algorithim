package Arrays;

public class check_sorted {
    public static void main(String[] args) {
        int arr[]={5,20,70,80,100};
        System.out.println(isSorted(arr));
    }
    static boolean isSorted(int[]arr){
        for (int i =1;i<arr.length;i++)
            if (arr[i]<arr[i-1])
                return false;
        return true;
    }
}
