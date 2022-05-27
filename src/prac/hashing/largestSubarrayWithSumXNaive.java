package prac.hashing;

public class largestSubarrayWithSumXNaive {

    public static void main(String[] args) {
        int arr[] = new int[]{8, 3, -7, -4, 1};
        int n = arr.length;
        int sum = -8;

        System.out.println(largestSubarrayWithSumX(arr, n, sum));
    }

    private static int largestSubarrayWithSumX(int[] arr, int n, int sum) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            int currSum = 0;
            for (int j = i; j < n; j++) {
                currSum += arr[j];
                if (currSum == sum)
                    res = Math.max(res, j - i + 1);
            }
        }
        return res;
    }
}
