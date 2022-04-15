package prac.arrays;

public class TrappingRainWaterNaive {

    public static void main(String args[])
    {
        int arr[] = {3, 0, 1, 2, 5}, n = 5;
        System.out.println( getWater(arr, n));
    }

    private static int getWater(int[] arr, int n) {
        int res = 0;
        for (int i = 1; i < n-1; i++) {

            int lmax = arr[i];
            for (int j = 0; j < i; j++) {
                lmax = Math.max(lmax,arr[j]);
            }

            int rmax = arr[i];
            for (int j = i+1; j <n ; j++) {
                rmax = Math.max(rmax,arr[j]);
            }

            res = res + (Math.min(lmax,rmax)-arr[i]);
        }
        return res;
    }
}
