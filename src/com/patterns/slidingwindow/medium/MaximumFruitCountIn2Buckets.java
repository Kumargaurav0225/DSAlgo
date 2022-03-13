package com.patterns.slidingwindow.medium;

import java.util.HashMap;
import java.util.Map;

public class MaximumFruitCountIn2Buckets {
    public static void main(String[] args) {
        System.out.println("Maximum number of fruits: " + findLength(new char[]{'A', 'B', 'C', 'A', 'C'}));
        System.out.println("Maximum number of fruits: " + findLength(new char[]{'A', 'B', 'C', 'B', 'B', 'C'}));
    }

    private static int findLength(char[] arr) {
        if (arr == null || arr.length == 0)
            return 0;

        int max = Integer.MIN_VALUE, windowStart = 0;
        Map<Character,Integer> fruitMap = new HashMap<>();
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            char currentFruitType = arr[windowEnd];
            fruitMap.put(currentFruitType,fruitMap.getOrDefault(currentFruitType,0)+1);
            while (fruitMap.size()>2){
                char fruitTypeToBeRemoved = arr[windowStart];
                fruitMap.put(fruitTypeToBeRemoved, fruitMap.get(fruitTypeToBeRemoved)-1);
                if (fruitMap.get(fruitTypeToBeRemoved)==0)
                    fruitMap.remove(fruitTypeToBeRemoved);
                windowStart++;
            }
            max = Math.max(max,windowEnd-windowStart+1);
        }
        return max;
    }
}
