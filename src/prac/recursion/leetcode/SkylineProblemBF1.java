package prac.recursion.leetcode;

import java.util.*;

public class SkylineProblemBF1 {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        // Sort the unique positions of all the edges.
        SortedSet<Integer> edgeSet = new TreeSet<Integer>();
        for (int[] building : buildings) {
            int left = building[0], right = building[1];
            edgeSet.add(left);
            edgeSet.add(right);
        }
        List<Integer> edges = new ArrayList<Integer>(edgeSet);

        // Hast table 'edgeIndexMap' record every {position : index} pairs in edges.
        Map<Integer, Integer> edgeIndexMap = new HashMap<>();
        for (int i = 0; i < edges.size(); ++i) {
            edgeIndexMap.put(edges.get(i), i);
        }

        // Initialize 'heights' to record maximum height at each index.
        int[] heights = new int[edges.size()];

        // Iterate over all the buildings.
        for (int[] building : buildings) {
            // For each building, find the indexes of its left
            // and right edges.
            int left = building[0], right = building[1], height = building[2];
            int leftIndex = edgeIndexMap.get(left), rightIndex = edgeIndexMap.get(right);

            // Update the maximum height within the range [left_idx, right_idx)
            for (int idx = leftIndex; idx < rightIndex; ++idx) {
                heights[idx] = Math.max(heights[idx], height);
            }
        }

        List<List<Integer>> answer = new ArrayList<>();

        // Iterate over 'heights'.
        for (int i = 0; i < heights.length; ++i) {
            int currHeight = heights[i], currPos = edges.get(i);

            // Add all the positions where the height changes to 'answer'.
            if (answer.isEmpty() || answer.get(answer.size() - 1).get(1) != currHeight) {
                answer.add(Arrays.asList(currPos, currHeight));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        SkylineProblemBF1 skylineProblemBF1 = new SkylineProblemBF1();
        int[][] buildings = {{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}};
        System.out.println("Output : "+skylineProblemBF1.getSkyline(buildings));
    }
}
