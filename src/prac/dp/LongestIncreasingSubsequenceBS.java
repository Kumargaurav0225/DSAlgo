package prac.dp;

public class LongestIncreasingSubsequenceBS {
    public static void main(String[] args) {
        int arr[] = {3, 10, 20, 4, 6, 7};
        int n = 6;

        System.out.println(LIS(arr, n));

    }

    private static int LIS(int[] arr, int n) {
        int[] tail = new int[n];
        int len = 1;

        tail[0] = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > tail[len - 1]) {
                tail[len] = arr[i];
                len++;
            } else {
                int c = ceilIdx(tail, 0, len - 1, arr[i]);
                tail[c] = arr[i];
            }
        }
        return len;
    }

    private static int ceilIdx(int[] tail, int leftIdx, int rightIdx, int key) {
        while (leftIdx < rightIdx) {
            int midIdx = leftIdx + (rightIdx - leftIdx) / 2;
            if (key < tail[midIdx])
                rightIdx = midIdx;
            else
                leftIdx = midIdx + 1;
        }
        return rightIdx;
    }
}
