package sorting;

import static sorting.merging_sort.mergeSort;

public class quick_sort {
    public static void main(String[] args) {
        int[] a = {8, 4, 7, 9, 3, 10, 5};
        System.out.println("Sorted array is");
     	quickSort(a, 0, a.length-1);

        for (int e : a) System.out.print(e + " ");


    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static int partition(int[] a, int l, int h) {
        int i = l;
        int j = h;

        int pivot = a[l];
        while (i < j) {
            while (i < j && a[i] <= pivot) i++;
            while (a[j] > pivot) j--;
            if (i < j) {
                swap(a, i, j);
            }
        }
        swap(a, l, j);
        return j;
    }

    static void quickSort(int[] a, int l, int h) {
        if (l < h) {
            int pivot = partition(a, l, h);
            quickSort(a, l, pivot - 1);
            quickSort(a, pivot + 1, h);
        }
    }
}
//what is the condition for worst case ---kya hoga worst case me
//best   case when pivot is center o(n log n)

