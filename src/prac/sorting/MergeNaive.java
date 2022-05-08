package prac.sorting;

import java.util.Arrays;

public class MergeNaive {
    public static void main (String[] args)
    {
        int a[] = new int[]{10,15,20,40};
        int b[] = new int[]{5,6,6,10,15};

        int m = a.length;
        int n = b.length;
        merge(a,b,m,n);
    }

    private static void merge(int[] a, int[] b, int m, int n) {
        int[] c= new int[m+n];

        for (int i = 0; i < m; i++)
            c[i]=a[i];

        for (int i = 0; i < n; i++)
            c[m+i]=b[i];

        Arrays.sort(c);
        for (int i : c) {
            System.out.print(i+" ");
        }
    }
}
