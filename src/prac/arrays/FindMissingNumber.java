package prac.arrays;

import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,7,8};

        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if((arr[i]-arr[i-1])>1)
                System.out.println(i+1);
        }
    }
}
