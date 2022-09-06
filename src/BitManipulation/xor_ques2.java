package BitManipulation;

//find the two non repeating element in an array where
// every element repeats itself twice(two odd occuring elements)
public class xor_ques2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 9, 11, 2, 3, 11};
        int n = arr.length;
        twoNonRepeat(arr, n);
    }

    static void twoNonRepeat(int arr[], int n) {
        //find xor of all numbers...
       // we get result as a^b.(two odd appearance)
        int xor = 0, temp1 = 0,temp2 = 0;
        int right;
        for (int i = 0; i < n; i++) {
            xor = (xor ^ arr[i]);
        }
        //divide in two groups..
        //set its as 1 and set bit as 0
        right = (xor & -xor); //rightmost set bit //-xor = ~(xor-1)
        //for eg 3(011)-- then 3-1 is(010)--then ~3-1(101)
        // thn & of 3  & ~3-1 THN RESULT IS 0000001.

        for (int i = 0; i < n; i++) {
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
