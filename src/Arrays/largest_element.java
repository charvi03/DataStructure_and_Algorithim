package Arrays;

public class largest_element {
    public static void main(String[] args) {
        int[] arr = {5, 8, 20, 10};
        System.out.println(largest(arr));

    }

    static int largest(int[] arr) {
        int res=arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > res)
                res=arr[i];
            return res;

    }
}
