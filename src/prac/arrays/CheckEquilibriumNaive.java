package prac.arrays;

public class CheckEquilibriumNaive {
    public static void main(String args[]) {
        int arr[] = {3, 4, 8, -9, 20, 6}, n = 6;
        System.out.println(checkEquilibrium(arr, n));
    }

    private static boolean checkEquilibrium(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            int lsum = 0, rsum = 0;

            for (int j = 0; j < i; j++)
                lsum += arr[j];

            for (int j = i + 1; j < n; j++)
                rsum += arr[j];

            if (lsum == rsum)
                return true;
        }
        return false;
    }
}
