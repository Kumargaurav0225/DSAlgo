package prac.sorting;

import java.util.Arrays;

public class MinimumDiffInArrayEfficient {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 8};
        System.out.println("Min diff : " + minDiff(arr));
    }

    private static int minDiff(int[] arr) {
        int res = Integer.MAX_VALUE;
        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            res = Math.min(res,(arr[i]-arr[i - 1]));
        }
        return res;
    }

}
