package prac.hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithEqual0And1Efficient {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 0, 1, 0, 1, 1, 1, 0, 1,1};
        int len = arr.length;

        System.out.println(largestZeroSubArray(arr, len));
    }

    static int largestZeroSubArray(int arr[], int n) {
        Map<Integer, Integer> hm = new HashMap<>();
        int sum = 0, maxLen = 0;
        for (int i = 0; i < n; i++)
            arr[i] = (arr[i] == 0) ? -1 : 1;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0)
                maxLen = i + 1;

            if (hm.containsKey(sum))
                maxLen = Math.max(maxLen, i - hm.get(sum));
            else
                hm.put(sum, i);
        }
        return maxLen;
    }
}
