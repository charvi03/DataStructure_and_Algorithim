package sorting;

import static sorting.bubble.bubbleSort;

public class bubble_sort {
    public static void main(String[] args) {
        int[] a = {4, 3, 7, 1,5};
        System.out.println("Sorted array is ");
        bubbleSort(a, 5);

        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }

    }
}

class bubble {

    static void bubbleSort(int[] arr, int n) {
        boolean swapped;

        for (int i = 0; i < n-1; i++) {

            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;

                }
            }
            if (!swapped)
                break;
        }
    }
}
// time complexity -- n *(n-1)/2
