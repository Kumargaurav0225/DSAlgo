package prac.arrays;

public class RemoveDupFromSortedArray {
    public static void main(String args[]) {
        int arr[] = {10, 20, 20, 30, 30, 30}, n = 6;
        System.out.println("Before Removal");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        n = remDups(arr, n);
        System.out.println("After Removal");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int remDups(int[] arr, int n) {
        int idx = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[idx-1] != arr[i]){
                arr[idx] = arr[i];
                idx++;
            }
        }
        return idx;
    }
}
