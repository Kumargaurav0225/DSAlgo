package prac.observations.slidingwindow.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinct {
    public static void main(String[] args) {
        System.out.println("Length of the longest substring: " + findLength("araaci", 2));
        System.out.println("Length of the longest substring: " + findLength("araaci", 1));
        System.out.println("Length of the longest substring: " + findLength("cbbebi", 3));
    }

    private static int findLength(String str,int k){
        if (str==null||str.length()==0)
            throw new IllegalArgumentException();

        int windowStart = 0,maxLength = Integer.MIN_VALUE;
        Map<Character,Integer> charFrequency = new HashMap<>();
        // In the following loop we'll try to extend the range [ windowStart, windowEnd ]

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            charFrequency.put(rightChar,charFrequency.getOrDefault(rightChar,0)+1);
            // Shrink the sliding window, until we are left with 'k' distinct characters in the frequency map

            while (charFrequency.size()>k){
                char leftChar = str.charAt(windowStart);
                charFrequency.put(leftChar,charFrequency.get(leftChar)-1);
                if (charFrequency.get(leftChar)==0){
                    charFrequency.remove(leftChar);
                }
                windowStart++; // Shrink the window
            }
            maxLength = Math.max(maxLength,windowEnd-windowStart+1); // remember the max length so far
        }
        return maxLength;
    }
}
