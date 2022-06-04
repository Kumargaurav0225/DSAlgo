package prac.observations.subsets.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PremutationRecursive {

    public static void main(String[] args) {
        List<List<Integer>> result = generatePermutations(new int[] { 1, 3, 5 });
        Collections.sort(result, Comparator.comparingInt(a->a.get(0)));
        System.out.print("Here are all the permutations: " + result);
    }

    private static List<List<Integer>> generatePermutations(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generatePermutationsRecursive(nums,0,new ArrayList<Integer>(),result);
        return result;
    }

    private static void generatePermutationsRecursive(int[] nums, int index, List<Integer> currentPermutation, List<List<Integer>> result) {
        if (index == nums.length){
            result.add(currentPermutation);
        }else {
            // create a new permutation by adding the current number at every position
            for (int i = 0; i <= currentPermutation.size() ; i++) {
                List<Integer> newPermutation = new ArrayList<>(currentPermutation);
                newPermutation.add(i,nums[index]);
                generatePermutationsRecursive(nums,index+1,newPermutation,result);
            }
        }
    }
}
