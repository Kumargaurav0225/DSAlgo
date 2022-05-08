package prac.sorting;

public class IntersectionOfArraysNaive {
    public static void main (String[] args) {
        int a[] = new int[]{3,5,10,10,10,15,15,20};
        int b[] = new int[]{5,10,10,15,30};

        int m = a.length;
        int n = b.length;
        intersection(a,b,m,n);
    }

    private static void intersection(int[] a, int[] b, int m, int n) {
        for (int i = 0; i < m; i++) {
            if (i>0 && a[i]==a[i-1])
                continue;
            for (int j = 0; j <n ; j++) {
                if (a[i]==b[j]){
                    System.out.print(b[j]+" ");
                    break;
                }
            }
        }
    }
}
