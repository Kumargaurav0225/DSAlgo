package prac.arrays;

public class MaximumProfitInStocksNaive {

    public static void main(String args[]) {
        int arr[] = {1, 5, 3, 8, 12}, n = 5;
        System.out.println(maxProfit(arr, 0, n - 1));
    }

    private static int maxProfit(int[] arr, int start, int end) {
        if (end <= start)
            return 0;
        int profit = 0;

        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (arr[j] > arr[i]) {
                    int curr_profit = (arr[j] - arr[i])
                            + maxProfit(arr, start, i - 1)
                            + maxProfit(arr, j + 1, end);

                    profit = Math.max(profit, curr_profit);
                }
            }
        }

        return profit;
    }
}
