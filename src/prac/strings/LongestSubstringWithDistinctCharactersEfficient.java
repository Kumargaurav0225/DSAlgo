package prac.strings;

import java.util.Arrays;

public class LongestSubstringWithDistinctCharactersEfficient {

    public static void main(String args[]) {
        String str = "geeksforgeeks";
        int len = longestDistinct(str);
        System.out.print("The length of the longest distinct characters substring is " + len);
    }

    private static int longestDistinct(String str) {
        int res = 0, i = 0, n = str.length();
        int[] prev = new int[256];

        Arrays.fill(prev, -1);

        for (int j = 0; j < n; j++) {
            i = Math.max(i, prev[str.charAt(j)] + 1);
            int maxLength = j - i + 1;
            res = Math.max(res, maxLength);
            prev[str.charAt(j)] = j;
        }
        return res;
    }
}
