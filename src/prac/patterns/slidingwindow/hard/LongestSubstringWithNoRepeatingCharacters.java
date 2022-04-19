package prac.patterns.slidingwindow.hard;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithNoRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println("Length of the longest substring: " + findLength("aabccbb"));
        System.out.println("Length of the longest substring: " + findLength("abbbb"));
        System.out.println("Length of the longest substring: " + findLength("abccde"));
    }

    private static int findLength(String str) {
        int windowStart = 0, maxLength = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();
        // try to extend the range [windowStart, windowEnd]
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            if (charIndexMap.containsKey(rightChar)){
                windowStart = Math.max(windowStart,charIndexMap.get(rightChar)+1);
            }
            charIndexMap.put(rightChar,windowEnd);
            maxLength = Math.max(maxLength,windowEnd-windowStart+1);
        }

        return maxLength;
    }
}
