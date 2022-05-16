package prac.searching;

public class MinPagesAllocationEfficient {
    public static void main(String[] args) {
        int arr[] = {10, 20, 10, 30};
        int n = arr.length;
        int k = 2;

        System.out.print(minPages(arr, n, k));
    }

    private static int minPages(int[] arr, int n, int k) {
        int pageSum = 0, maxPages = 0;

        for (int i = 0; i < n; i++) {
            pageSum += arr[i];
            maxPages = Math.max(maxPages, arr[i]);
        }

        int low = maxPages, high = pageSum, res = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isFeasible(arr, n, k, mid)) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }

    private static boolean isFeasible(int[] arr, int n, int k, int mid) {
        int reqStudent = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            if (sum + arr[i] > mid) {
                reqStudent++;
                sum = arr[i];
            } else {
                sum += arr[i];
            }
        }
        return (reqStudent <= k);
    }
}
