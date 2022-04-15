package prac.arrays;

public class MaximumCircularSubArraySumEfficient {
    public static void main(String args[]) {
        int arr[] = {5, -2, 3, 4}, n = 4;
        System.out.println(maxCircularSum(arr, n));
    }

    private static int maxCircularSum(int[] arr, int n) {
        int res = 0;
        int maxNormalSum = normalSubArraySum(arr,n);

        if (maxNormalSum<0)
            return maxNormalSum;

        int arr_sum = 0;
        for (int i = 0; i <n ; i++) {
            arr_sum += arr[i];
            arr[i] = -arr[i];
        }

        int maxCircularSum = maxNormalSum+normalSubArraySum(arr, n);
        res = Math.max(maxCircularSum,maxNormalSum);
        return res;
    }

    private static int normalSubArraySum(int[] arr,int n){
        int res = arr[0];
        int maxEnding = arr[0];
        for (int i = 1; i < n; i++) {
            maxEnding = Math.max(arr[i],maxEnding+arr[i]);
            res = Math.max(res,maxEnding);
        }
        return res;
    }
}
