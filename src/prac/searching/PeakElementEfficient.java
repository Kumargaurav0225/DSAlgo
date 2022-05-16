package prac.searching;

public class PeakElementEfficient {
    public static void main(String[] args) {
        int arr[] = {5, 20, 40, 30, 20, 50, 60}, n = 7;
        System.out.println(getPeak(arr, n));
    }

    private static int getPeak(int[] arr, int n) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid] >= arr[mid + 1]))
                return arr[mid];

            if (mid > 0 && arr[mid] < arr[mid - 1])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
