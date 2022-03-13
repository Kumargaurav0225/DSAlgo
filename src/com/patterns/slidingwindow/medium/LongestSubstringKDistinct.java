package com.patterns.slidingwindow.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinct {
    public static void main(String[] args) {
        System.out.println("Length of the longest substring: " + findLength("araaci", 2));
        System.out.println("Length of the longest substring: " + findLength("araaci", 1));
        System.out.println("Length of the longest substring: " + findLength("cbbebi", 3));
    }

    private static int findLength(String str, int k) {
        if (str == null || str.isEmpty())
            throw new IllegalArgumentException();

        int maxLength = Integer.MIN_VALUE, windowStart = 0;

        Map<Character, Integer> charFrequency = new HashMap<>();
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {

            char rightChar = str.charAt(windowEnd);
            charFrequency.put(rightChar, charFrequency.getOrDefault(rightChar, 0) + 1);
            while (charFrequency.size() > k) {
                char leftChar = str.charAt(windowStart);
                charFrequency.put(leftChar, charFrequency.get(leftChar) - 1);
                if (charFrequency.get(leftChar) == 0)
                    charFrequency.remove(leftChar);
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}
