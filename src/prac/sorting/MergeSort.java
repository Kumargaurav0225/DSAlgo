package prac.sorting;

import java.lang.*;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = new int[]{10, 5, 30, 15, 7};
        int l = 0, r = 4;

        mergeSort(arr, l, r);
        for (int x : arr)
            System.out.print(x + " ");
    }

    static void mergeSort(int arr[], int l, int r) {
        if (r > l) {
            int midIdx = l + (r - l) / 2;
            mergeSort(arr, l, midIdx);
            mergeSort(arr, midIdx + 1, r);
            merge(arr, l, midIdx, r);
        }
    }

    static void merge(int arr[], int lIdx, int mIdx, int rIdx) {

        int n1 = mIdx - lIdx + 1, n2 = rIdx - mIdx;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++)
            left[i] = arr[i + lIdx];
        for (int j = 0; j < n2; j++)
            right[j] = arr[mIdx + 1 + j];

        int i = 0, j = 0, k = lIdx;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < n1)
            arr[k++] = left[i++];
        while (j < n2)
            arr[k++] = right[j++];
    }
}
