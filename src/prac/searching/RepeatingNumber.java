package prac.searching;

public class RepeatingNumber {
    public static void main(String[] args) {
        int arr[] = {0, 2, 1, 3, 2, 2}, n = 6;
        System.out.println(repeat(arr, n));
    }

    private static int repeat(int[] arr, int n) {
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[arr[i]])
                return arr[i];
            visited[arr[i]] = true;
        }
        return -1;
    }
}
