package prac.arrays;

public class MaximumSumOfKConsecutiveElementsNaive {
    public static void main(String args[]) {
        int arr[] = {1, 8, 30, -5, 20, 7}, n = 6, k = 3;
        System.out.println(maxSum(arr, n, k));
    }

    private static int maxSum(int[] arr, int n, int k) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i+k-1 < n; i++) {
            int curr_sum = 0;
            for (int j = 0; j < k ; j++) {
                curr_sum += arr[i+j];
            }
            maxSum = Math.max(maxSum,curr_sum);
        }
        return maxSum;
    }
}
