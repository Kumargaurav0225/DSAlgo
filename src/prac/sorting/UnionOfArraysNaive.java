package prac.sorting;

/* Time complexity : O((m+n)*log(m+n))*/

import java.util.Arrays;

public class UnionOfArraysNaive {
    public static void main(String[] args) {
        int a[] = new int[]{3, 8, 10};
        int b[] = new int[]{2, 8, 9, 10, 15};

        int m = a.length;
        int n = b.length;
        printUnion(a, b, m, n);
    }

    private static void printUnion(int[] a, int[] b, int m, int n) {
        int[] c = new int[m + n];

        for (int i = 0; i < m; i++) {
            c[i] = a[i];
        }

        for (int j = 0; j < n; j++) {
            c[m + j] = b[j];
        }

        Arrays.sort(c);

        for (int i = 0; i < c.length; i++) {
            if (i == 0 || c[i] != c[i - 1])
                System.out.print(c[i] + " ");
        }
    }
}
