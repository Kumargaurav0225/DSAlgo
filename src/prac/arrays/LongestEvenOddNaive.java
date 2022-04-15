package prac.arrays;

public class LongestEvenOddNaive {

    public static void main(String args[]) {
        int arr[] = {5, 10, 20, 6, 3, 8}, n = 6;
        System.out.println(maxEvenOdd(arr, n));
    }

    private static int maxEvenOdd(int[] arr, int n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            int curr = 1;
            for (int j = i + 1; j < n; j++) {
                if ((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0) ||
                        (arr[j] % 2 != 0 && arr[j - 1] % 2 == 0)) {
                    curr++;
                } else {
                    break;
                }
            }
            res = Math.max(res, curr);
        }
        return res;
    }
}
