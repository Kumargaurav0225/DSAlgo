package prac.arrays;

public class TrappingRainWaterEfficient {
    public static void main(String args[])
    {
        int arr[] = {3, 0, 1, 2, 5}, n = 5;
        System.out.println( getWater(arr, n));
    }

    private static int getWater(int[] arr, int n) {
        int res = 0;
        int[] lmax = new int[n];
        int[] rmax  = new int[n];

        lmax[0] = arr[0];
        rmax[n-1] = arr[n-1];

        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(lmax[i-1],arr[i]);
        }

        for (int i = n-2; i>=0; i--) {
            rmax[i] = Math.max(rmax[i+1],arr[i]);
        }

        for (int i = 1; i < n-1 ; i++) {
            res = res+(Math.min(lmax[i],rmax[i]) - arr[i]);
        }
        return res;
    }
}
