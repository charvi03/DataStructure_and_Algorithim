package sorting;

public class merging_sort {
    public static void main(String[] args) {
        int[] a = new int[]{10, 5, 30, 15, 7};
        int l = 0, r = 4;
        System.out.println("Sorted array is ");
        mergeSort(a, l, r);
        for (int x : a)
            System.out.print(x + " ");

    }

    static void merge(int[] arr, int l, int m, int h) {

        int n1 = m - l + 1, n2 = h - m;
        int[] left = new int[n1];
        int[] right = new int[n2];
        System.arraycopy(arr, l, left, 0, n1);
        for (int j = 0; j < n2; j++)
            right[j] = arr[m + 1 + j];
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }
        while (i < n1)
            arr[k++] = left[i++];
        while (j < n2)
            arr[k++] = right[j++];
    }

    static void mergeSort(int[] arr, int l, int r) {
        if (r > l) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
}
