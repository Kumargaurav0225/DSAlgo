package prac.hashing;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithGivenSumEfficient {
    public static void main(String[] args) {
        int arr[] = new int[]{6, 13, 3,5, 8,-1};
        int sum=22;
        int n = arr.length;

        System.out.println(isSum(arr, n, sum));
    }

    private static boolean isSum(int[] arr, int n, int sum) {
        int prefixSum =0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            prefixSum+=arr[i];
            if (prefixSum==sum)
                return true;
            if (set.contains(prefixSum-sum))
                return true;
            else
                set.add(prefixSum);
        }
        return false;
    }
}
