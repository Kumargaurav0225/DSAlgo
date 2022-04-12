package prac.arrays;

public class CheckIfSorted {
    public static void main(String args[])
    {
        int arr[] = {2, 5, 12, 30, 35}, n = 5;
        System.out.println(isSorted(arr, n));
    }

    private static boolean isSorted(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i-1]>arr[i])
                return false;
        }
        return true;
    }
}
