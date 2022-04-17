package prac.strings;

import java.util.Arrays;

public class LeftmostRepeatingCharacterEfficient2 {

    public static void main(String args[])
    {   String str = "geeksforgeeks";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost(str));
    }

    private static int leftMost(String str) {

        final int CHAR = 256;
        int[] fIndex = new int[CHAR];
        Arrays.fill(fIndex,-1);
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < str.length(); i++) {
            int fi = fIndex[str.charAt(i)];
            if (fi == -1)
                fIndex[str.charAt(i)] = i;
            else
                res = Math.min(res,fi);
        }

        return res != -1 ? res : -1;
    }
}
