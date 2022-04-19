package prac.patterns.twopointers.easy;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] result = hashSearch(new int[]{1, 2, 3, 4, 6}, 6);
        System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
        result = twoPointer(new int[]{2, 5, 9, 11}, 11);
        System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
    }

    private static int[] bruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target){
                    if (i != j){
                        return new int[]{i,j};
                    }
                }
            }
        }
        return new int[]{-1,-1};
    }

    private static int[] twoPointer(int[] arr,int target){
        int left = 0,right = arr.length-1;
        while (left<right){
            int sum = arr[left]+arr[right];

            if (sum == target)
                return new int[]{left,right};

            if (sum<target){
                left++;
            }else {
                right--;
            }
        }
        return new int[]{-1,-1};
    }

    private static int[] hashSearch(int[] arr,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target-arr[i])){
                return new int[]{map.get(target-arr[i]),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
}
