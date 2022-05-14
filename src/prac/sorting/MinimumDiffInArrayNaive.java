package prac.sorting;

public class MinimumDiffInArrayNaive {
        public static void main(String[] args) {
            int[] arr = new int[]{5,3,8};
            System.out.println("Min diff : "+minDiff(arr));
        }

    private static int minDiff(int[] arr) {
        int res = Integer.MAX_VALUE;
        int n= arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <i; j++) {
                res=Math.min(res,Math.abs(arr[i]-arr[j]));
            }
        }
        return res;
    }
}
