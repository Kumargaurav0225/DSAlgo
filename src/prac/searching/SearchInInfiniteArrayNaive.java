package prac.searching;

public class SearchInInfiniteArrayNaive {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 5};
        int x = 4;

        System.out.println(search(arr, x));
    }

    private static int search(int[] arr, int x) {
        int i = 0;
        while (true) {
            if (arr[i] == x) return i;

            if (arr[i] > x) return -1;

            i++;
        }
    }
}
