package prac.hashing;

public class SubArrayWithGivenSumNaive {
    public static void main(String[] args) {
        int arr[] = new int[]{5, 8, 6, 13, 3, -1};
        int sum = 22;
        int n = arr.length;

        System.out.println(isSum(arr, n, sum));
    }

    private static boolean isSum(int[] arr, int n, int sum) {

        for (int i = 0; i < n; i++) {
            int currSum = 0;
            for (int j = i; j < n; j++) {
                currSum += arr[j];
                if (currSum == sum)
                    return true;
            }
        }
        return false;
    }
}
