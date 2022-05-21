package prac.hashing;

import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubArray {
    public static void main(String[] args) {
        int arr[] = new int[]{5, 3, 9, -4, -6, 7, -1};
        int n = arr.length;

        System.out.println(ZeroSumSubarray(arr, n));
    }

    private static boolean ZeroSumSubarray(int[] arr, int n) {
        int prefixSum = 0;
        Set<Integer> set = new HashSet<>();
        set.add(0);

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            if (set.contains(prefixSum))
                return true;
            if (prefixSum == 0)
                return true;
            set.add(prefixSum);
        }

        return false;
    }
}
