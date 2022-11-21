package sorting;

import static sorting.selection.selectionSort;

public class selection_sort {
    public static void main(String[] args) {
        int[] a = {10, 5, 8, 20, 2, 18};
        selectionSort(a, 6);

        for (int i = 0; i < 6; i++) {
            System.out.print(a[i] + " ");
        }

    }
}

class selection {


    static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min_ind = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_ind]) {
                    min_ind = j;
                }
            }
            if(min_ind!=i){

            int temp = arr[i];
            arr[i] = arr[min_ind];
            arr[min_ind] = temp;
            }
        }
    }
}
