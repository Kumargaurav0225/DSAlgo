package prac.arrays;

public class CheckEquilibriumEfficient {
    public static void main(String args[]) {
        int arr[] = {3, 4, 8, -9, 20, 6}, n = 6;
        System.out.println(checkEquilibrium(arr, n));
    }

    private static boolean checkEquilibrium(int[] arr, int n) {

        int sum=0;
        for (int i = 0; i < n; i++)
            sum += arr[i];

        int lSum =0;
        for (int i = 0; i < n; i++) {
            if (lSum == (sum-arr[i])){
                return true;
            }
            lSum += arr[i];
            sum -= arr[i];
        }
        return false;
    }
}
