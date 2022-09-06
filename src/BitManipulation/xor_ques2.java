package BitManipulation;

//find the two non repeating element in an array where
// every element repeats itself twice
public class xor_ques2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 9, 11, 2, 3, 11};
        int n = arr.length;
        twoNonRepeat(arr, n);
    }

    static void twoNonRepeat(int arr[], int n) {
        int temp = arr[0];
        int right;
        for (int i = 0; i < n; i++) {
            temp = (temp ^ arr[i]);

        }
        right = (temp & -temp);
        int temp1 = 0;
        int temp2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & right) != 0) {
                temp1 = (temp1 ^ arr[i]);
            } else {
                temp2 = (temp2 ^ arr[i]);
            }
        }

        System.out.println("the non repeating elements are : "
                + temp1 + " and " + temp2);

    }
}
