package prac.arrays;

public class MaximumDiff {
    public static void main(String args[])
    {
        int arr[] = {2, 3, 10, 6, 4, 8, 1}, n = 7;
        System.out.println(maxDiffNaive(arr, n));
        System.out.println(maxDiffEficient(arr, n));
    }

    private static int maxDiffEficient(int[] arr, int n) {
        int res = arr[1]-arr[0];
        int minVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = Math.max(res,arr[i]-res);
            minVal = Math.min(minVal,arr[i]);
        }
        return res;
    }

    private static int maxDiffNaive(int[] arr, int n) {
        int res = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                res = Math.max(res,arr[j]-arr[i]);
            }
        }
        return res;
    }
}
