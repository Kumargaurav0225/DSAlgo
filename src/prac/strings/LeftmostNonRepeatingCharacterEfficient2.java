package prac.strings;

import java.util.Arrays;

public class LeftmostNonRepeatingCharacterEfficient2 {

    public static void main(String args[]) {
        String str = "geeksforgeeks";
        System.out.println("Index of leftmost non-repeating element:");
        System.out.println(nonRep(str));
    }

    private static int nonRep(String str) {
        final int CHAR = 256;
        int[] count = new int[CHAR];
        Arrays.fill(count, -1);

        for (int i = 0; i < str.length(); i++) {
            int fi = str.charAt(i);
            if (count[fi] == -1) {
                count[fi] = i;
            } else {
                count[fi] = -2;
            }
        }

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < CHAR; i++) {
            if (count[i] > 0)
                res = Math.min(res, count[i]);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }

}
