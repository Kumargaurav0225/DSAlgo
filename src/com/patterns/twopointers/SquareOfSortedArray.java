package com.patterns.twopointers;

public class SquareOfSortedArray {
    public static void main(String[] args) {

        int[] result = makeSquares(new int[]{-2, -1, 0, 2, 3});
        for (int num : result)
            System.out.print(num + " ");
        System.out.println();

        result = makeSquares(new int[]{-3, -1, 0, 1, 2});
        for (int num : result)
            System.out.print(num + " ");
        System.out.println();
    }

    private static int[] makeSquares(int[] arr) {
        int n = arr.length;
        int left = 0, highestIdx = n-1;
        int right = arr.length-1;
        int[] sq = new int[n];

        while(left<=right){
            int leftSq = arr[left]*arr[left];
            int rightSq = arr[right]*arr[right];

            if (leftSq>rightSq){
                sq[highestIdx] = leftSq;
                left++;
            }else {
                sq[highestIdx] = rightSq;
                right--;
            }
            highestIdx--;
        }
        return sq;
    }
}
