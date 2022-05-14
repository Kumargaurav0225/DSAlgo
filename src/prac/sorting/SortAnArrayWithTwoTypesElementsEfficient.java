package prac.sorting;

public class SortAnArrayWithTwoTypesElementsEfficient {
    public static void main(String[] args) {
        int arr[] = new int[]{13, -12, 18, -10};
        int n = arr.length;

        sort(arr, n);

        for (int x : arr)
            System.out.print(x + " ");

    }

    private static void sort(int[] arr, int n) {
        int i = -1, j = n;

        while (true) {
            do {
                i++;
            } while (arr[i] < 0);

            do {
                j--;
            } while (arr[j] > 0);

            if (i >= j)
                return;

            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }
}
