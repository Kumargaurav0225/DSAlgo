package prac.arrays;

public class MajorityElementNaive {
    public static void main(String args[]) {
        int arr[] = {8, 7, 6, 8, 6, 6, 6, 6}, n = 8;
        System.out.println(findMajority(arr, n));
    }

    private static int findMajority(int[] arr, int n) {
        for (int i = 0; i <n ; i++) {
            int count =1;
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count>n/2){
                return i;
            }
        }
        return -1;
    }
}
