package com.patterns.slidingwindow.easy;

public class MinSizeSubArraySum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int k = 7;

        int res = findMinSizeSubArray(arr, k);
        System.out.println("RES :: "+res);
    }

    private static int findMinSizeSubArray(int[] arr, int s) {
        int minLength = Integer.MAX_VALUE;
        int windowStart = 0, windowSum = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];
            while (windowSum >= s) {
                minLength = Math.min(minLength,windowEnd - windowStart+ 1);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }

        return minLength != Integer.MAX_VALUE ? minLength : 0;
    }
}
