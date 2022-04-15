package prac.arrays;

public class MaximumSumSubArrayEfficient {

    public static void main(String args[]) {
        int arr[] = {1, -2, 3, -1, 2}, n = 5;
        System.out.println(maxSum(arr, n));
    }

    private static int maxSum(int[] arr, int n) {
        int res = 0;
        int maxEnding = 0;

        for (int i = 0; i < n; i++) {
            maxEnding = Math.max(maxEnding+arr[i],arr[i]);
            res = Math.max(maxEnding,res);
        }
        return res;
    }
}
