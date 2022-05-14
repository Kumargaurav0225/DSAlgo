package prac.sorting;

public class SortArrayWithThreeTypesEfficient {
    public static void main(String[] args) {
        int arr[] = new int[]{0, 1, 1, 2, 0, 1, 1, 2};
        int n = arr.length;

        sort(arr, n);

        for (int x : arr)
            System.out.print(x + " ");
    }

    private static void sort(int[] arr, int n) {
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    //swapping arr[l] & arr[mid])
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;

                    low++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    //swapping arr[h] & arr[mid])
                    temp = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp;

                    high--;
                    break;
            }
        }
    }
}
