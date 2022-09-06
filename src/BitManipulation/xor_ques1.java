package BitManipulation;

//find the only non repeating element in an array where
// every element repeats itself twice (one odd occuring elements)
public class xor_ques1 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 4, 3, 5, 1};
        int n = arr.length;
        System.out.println("Non repeating element is :");
        System.out.println(nonR(arr, n));

    }

//    static int nonRepeating(int arr[], int n) {
//        for (int i = 0; i < n; i++) {
//            int j;
//            for (j = 0; j < n; j++) {
//                if (i != j && arr[i] == arr[j]) {
//                    break;
//                }
//            }
//            if (j == n)
//                return arr[i];
//
//        }
//        return -1;
//    }

    static int nonR(int arr[], int n) {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp = (temp ^ arr[i]);
        }
        return  temp;
    }
}
