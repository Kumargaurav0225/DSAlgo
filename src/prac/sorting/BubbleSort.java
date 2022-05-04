package prac.sorting;

public class BubbleSort {
    public static void main (String[] args) {
        int a[] = {2, 1, 4, 3};
        bubbleSort(a, 4);

        for(int i = 0; i < 4; i++){
            System.out.print(a[i] + " ");
        }
    }

    private static void bubbleSort(int[] arr, int len) {
        for (int i = 0; i < len-1; i++) {
            for (int j = 0; j < len-i-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    swap(arr, j);
                }
            }
        }
    }

    private static void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j +1];
        arr[j +1] = temp;
    }
}
