package prac.arrays;

public class FreqInSortedArray {
    public static void main(String args[]) {
        int arr[] = {10, 10, 20, 30, 30, 30, 40}, n = 7;
        printFreq(arr, n);
    }

    private static void printFreq(int[] arr, int n) {
        int i = 1, freq = 1;

        while (i < n) {
            while (i < n && arr[i - 1] == arr[i]) {
                freq++;
                i++;
            }
            System.out.println(arr[(i - 1)] + " : " + freq);
            i++;
            freq = 1;
        }
        if (n == 1 || (arr[n - 2] != arr[n - 1]))
            System.out.println(arr[(n - 1)] + " : " + 1);
    }
}
