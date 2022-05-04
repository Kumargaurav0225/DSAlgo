package prac.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {2, 1, 4, 3};
        selectionSort(a, 4);

        System.out.println(Arrays.toString(a));
    }

    private static void selectionSort(int[] arr, int len) {
        int minIdx;
        for (int i = 0; i < len - 1; i++) {
            minIdx = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
