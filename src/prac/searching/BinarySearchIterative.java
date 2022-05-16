package prac.searching;

public class BinarySearchIterative {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60}, n = 6;
        int x = 30;

        System.out.println(bSearch(arr, n, x));
    }

    private static int bSearch(int[] arr, int n, int x) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x == arr[mid])
                return mid;
            else if (x < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
