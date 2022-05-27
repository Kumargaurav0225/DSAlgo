package prac.observations.subsets.easy;

import java.util.*;

public class Subsets {

    public static List<List<Integer>> findSubsets(List<Integer> nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        // start by adding the empty subset
        subsets.add(new ArrayList<>());
        for (int currentNumber : nums) {
            // we will take all existing subsets and insert the current number in them to create new subsets
            int n = subsets.size();
            for (int i = 0; i < n; i++) {
                // create a new subset from the existing subset and insert the current element to it
                List<Integer> set = new ArrayList<>(subsets.get(i));
                set.add(currentNumber);
                subsets.add(set);
            }
        }
        return subsets;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = Subsets.findSubsets(Arrays.asList(1, 3));
        System.out.println("Here is the list of subsets: " + result);

        result = Subsets.findSubsets(Arrays.asList(1, 5, 3));
        System.out.println("Here is the list of subsets: " + result);
    }
}

