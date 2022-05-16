package prac.searching;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70}, n = 7;
        int x = 40;

        System.out.println(bSearch(arr, 0, n - 1, x));
    }

    private static int bSearch(int[] arr, int low, int high, int x) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x)
                return mid;
            else if (arr[mid] > x)
                return bSearch(arr, low, mid - 1, x);
            else
                return bSearch(arr, mid + 1, high, x);
        }
        return -1;
    }
}
