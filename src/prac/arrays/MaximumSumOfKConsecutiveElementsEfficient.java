package prac.arrays;

public class MaximumSumOfKConsecutiveElementsEfficient {
    public static void main(String args[]) {
        int arr[] = {1, 8, 30, -5, 20, 7}, n = 6, k = 3;
        System.out.println(maxSum(arr, n, k));
    }

    private static int maxSum(int[] arr, int n, int k) {
        int maxSum = 0,windowSum =0;
        for (int i = 0; i <k ; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;
        for (int i = k; i < n; i++) {
            windowSum += (arr[i]-arr[i-k]);
            maxSum = Math.max(windowSum,maxSum);
        }
        return maxSum;
    }
}
