package prac.hashing;

public class LongestCommonSpanWithSameSumInBinaryArrNaive {
    // Driver code
    public static void main(String args[]) {
        int[] arr1 = {0, 1, 0, 1, 1, 1, 1};
        int[] arr2 = {1, 1, 1, 1, 1, 0, 1};
        int n = arr1.length;

        System.out.println(longestCommonSum(arr1, arr2, n));
    }

    private static int longestCommonSum(int[] arr1, int[] arr2, int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            int sum1 = 0, sum2 = 0;
            for (int j = i; j < n; j++) {
                sum1 += arr1[j];
                sum2 += arr2[j];
                if (sum1 == sum2)
                    res = Math.max(res, j - i + 1);
            }
        }
        return res;
    }
}
