package prac.arrays;

public class SubArraySum {
    public static void main(String[] args) {
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int n = arr.length;
        int sum = 23;
        System.out.println(subArraySum(arr, n, sum));
    }

    /* Returns true if the there is a subarray of arr[] with sum equal to
	'sum' otherwise returns false. Also, prints the result */
    private static boolean subArraySum(int[] arr, int n, int sum) {
        int currSum = 0, start = 0, i;

        // Pick a starting point
        for (i = 1; i < n; i++) {

            while (currSum > sum && start< i-1){
                currSum -= arr[start];
                start++;
            }
            // If curr_sum becomes equal to sum, then return true
            if (currSum == sum){
                int p = i-1;
                System.out.println("Sum found between indexes " + start
                        + " and " + p);
                return true;
            }

            // Add this element to curr_sum
            if (i<n)
                currSum += arr[i];
        }

        System.out.println("No subarray found");
        return false;
    }
}
