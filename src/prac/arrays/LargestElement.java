package prac.arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {50, 30, 10, 5, 90, 60};
        int res = findLargest(arr);
        System.out.println("Largest : "+res);
    }

    private static int findLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i: arr) {
            if (i>largest)
                largest = i;
        }
        return largest;
    }
}
