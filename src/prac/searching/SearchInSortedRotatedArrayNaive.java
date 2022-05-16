package prac.searching;

public class SearchInSortedRotatedArrayNaive {
    public static void main(String[] args) {
        int arr[] = {100, 200, 400, 1000, 10, 20}, n = 6;
        int x = 10;

        System.out.println(search(arr, n, x));
    }

    private static int search(int[] arr, int n, int x) {
        int i = 0;
        while (i < n) {
            if (arr[i] == x)
                return i;
            i++;
        }
        return -1;
    }
}
