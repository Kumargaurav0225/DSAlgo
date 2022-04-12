package prac.arrays;

public class LargestThree {
    public static void main(String[] args) {
        int[] arr = {50, 30, 10, 5, 90, 60};
        int[] res = findLargestThree(arr);
        for (int i : res) {
            System.out.println(i + " ");
        }
    }

    private static int[] findLargestThree(int[] arr) {
        if (arr.length < 3) {
            throw new RuntimeException("Bad Input");
        }
        int[] res = new int[3];
        // Initialize first, second and third Largest element
        int first = arr[0], second = Integer.MIN_VALUE,
                third = Integer.MIN_VALUE;

        // Traverse array elements to find the third Largest
        for (int i = 1; i < arr.length; i++) {
            /* If current element is greater than first,
        then update first, second and third */
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } /* If arr[i] is in between first and second */ else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } /* If arr[i] is in between second and third */ else if (arr[i] > third) {
                third = arr[i];
            }
        }

        res[0] = first;
        res[1] = second;
        res[2] = third;

        return res;
    }
}
