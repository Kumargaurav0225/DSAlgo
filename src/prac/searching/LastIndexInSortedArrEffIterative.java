package prac.searching;

public class LastIndexInSortedArrEffIterative {
    public static void main(String[] args) {
        int arr[] = {5, 10, 10, 10, 10, 20, 20}, n = 7;
        int x = 20;

        System.out.println(lastOcc(arr, n, x));

    }

    private static int lastOcc(int[] arr, int n, int x) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (x < arr[mid]) {
                high = mid - 1;
            } else if (x > arr[mid]) {
                low = mid + 1;
            } else {
                if (mid == n - 1 || arr[mid] != arr[mid + 1])
                    return mid;
                else
                    low = mid + 1;
            }
        }

        return -1;
    }
}
