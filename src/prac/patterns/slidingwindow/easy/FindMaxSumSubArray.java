package prac.patterns.slidingwindow.easy;

public class FindMaxSumSubArray {
    public static void main(String[] args) {
        int[] input={2, 1, 5, 1, 3, 2};
        int window = 3;

        int res = maxSumOfKSubArrayBruteForce(input,window);
        System.out.println("Res :: "+res);

        int slideRes = maxSumOfKSubArray(input,window);
        System.out.println("Sliding res :: "+slideRes);
    }

    private static int maxSumOfKSubArrayBruteForce(int[] arr, int k) {
        int maxSum =0;
        for (int i = 0; i < arr.length-k+1; i++) {
            int currSum = 0;
            for (int j = i; j < i+k; j++) {
                currSum += arr[j];
            }
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }

    private static int maxSumOfKSubArray(int[] arr,int k){
        int windowStart =0,windowSum=0,maxSum = 0;
        for (int windowEnd=0;windowEnd<arr.length;windowEnd++){
            windowSum += arr[windowEnd];
            if (windowEnd >= k-1){
                maxSum = Math.max(windowSum,maxSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }
}
