package prac.sorting;

/* Applicable only for sorted arrays */
public class IntersectionOfArraysEfficient {

    public static void main(String[] args) {
        int a[] = new int[]{3, 5, 10, 10, 10, 15, 15, 20};
        int b[] = new int[]{5, 10, 10, 15, 30};

        int m = a.length;
        int n = b.length;
        intersection(a, b, m, n);
    }

    private static void intersection(int[] a, int[] b, int m, int n) {

        int i = 0, j = 0;
        while (i < m && j < n) {

            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }

            if (a[i] < b[j]) {
                i++;
            } else if (b[j] < a[i]) {
                j++;
            } else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
    }
}
