package prac.hashing;

public class LongestSubArrayWithEqual0And1 {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 1, 1, 0, 1, 0, 1, 1, 1};
        int len = arr.length;

        System.out.println(largestZeroSubArray(arr, len));
    }

    private static int largestZeroSubArray(int[] arr, int len) {
        int res=0;

        for (int i = 0; i <len; i++) {
            int countZero=0,countOne=0;
            for (int j = i; j <len ; j++) {
                if (arr[j]==0)
                    countZero++;
                else
                    countOne++;
                if (countOne==countZero)
                    res=Math.max(res,countZero+countOne);
            }
        }
        return res;
    }
}
