package prac.hashing;

import java.util.HashMap;

public class largestSubarrayWithSumXEfficient {
    public static void main(String[] args) {
        int arr[] = new int[]{8, 3, 5, -7, -4, 1, 2, 2, 4};
        int n = arr.length;
        int sum = 8;

        System.out.println(largestSubarrayWithSumX(arr, n, sum));
    }

    private static int largestSubarrayWithSumX(int[] arr, int n, int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0, res = 0;

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            if (prefixSum == sum)
                res = i + 1;
            if (!map.containsKey(prefixSum))
                map.put(prefixSum, i);
            if (map.containsKey(prefixSum - sum))
                res = Math.max(res, i - map.get(prefixSum - sum));
        }
        return res;
    }
}
