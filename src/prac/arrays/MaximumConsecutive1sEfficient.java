package prac.arrays;

public class MaximumConsecutive1sEfficient {
    public static void main(String args[])
    {
        int arr[] = {0, 1, 1, 0, 1, 1, 1}, n = 7;
        System.out.println(maxConsecutiveOnes(arr, n));
    }

    private static int maxConsecutiveOnes(int[] arr, int n) {
        int res=0,count=0;

        for (int i = 0; i < n; i++) {
            if (arr[i]==1){
                count++;
            }else {
                count = 0;
            }
            res = Math.max(res,count);
        }
        return res;
    }
}
