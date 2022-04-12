package prac.arrays;

public class SearchOperation {
    public static void main(String args[])
    {
        int arr[] = {20, 5, 7, 25}, x = 7;
        System.out.println(search(arr, arr.length, x));
    }

    private static int search(int[] arr, int length, int x) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
}
