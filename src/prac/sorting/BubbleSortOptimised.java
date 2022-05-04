package prac.sorting;

public class BubbleSortOptimised {
    public static void main (String[] args) {
        int a[] = {1, 2, 4, 3};
        bubbleSort(a, 4);

        for(int i = 0; i < 4; i++){
            System.out.print(a[i] + " ");
        }
    }

    private static void bubbleSort(int[] arr, int len) {
        boolean isSwapped;
        for (int i = 0; i < len-1; i++) {
            isSwapped = false;
            for (int j = 0; j < len-i-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    swap(arr, j);
                    isSwapped=true;
                }
            }
            if (!isSwapped)
                break;
        }
    }

    private static void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j +1];
        arr[j +1] = temp;
    }
}
