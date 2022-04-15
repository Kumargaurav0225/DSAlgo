package prac.arrays;

import java.util.Stack;

public class LeadersInArray {
    public static void main(String args[])
    {
        int arr[] = {7, 10, 4, 10, 6, 5, 2}, n = 7;
        leaders(arr, n);
    }

    private static void leaders(int[] arr, int n) {
        int curr_ldr = arr[n-1];
        Stack<Integer> stack = new Stack<>();
        stack.push(curr_ldr);
        for (int i = n-2; i >= 0 ; i--) {
            if (curr_ldr < arr[i]){
                curr_ldr = arr[i];
                stack.push(curr_ldr);
            }
        }
        System.out.println(stack.toString());
    }
}
