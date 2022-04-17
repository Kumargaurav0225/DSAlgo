package prac.strings;

public class LeftmostRepeatingCharacterEfficient1 {

    public static void main(String args[])
    {   String str = "geeksforgeeks";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost(str));
    }

    private static int leftMost(String str) {
        final int CHAR = 256;
        int[] count = new int[CHAR];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        for (int i = 0; i <str.length(); i++) {
            if (count[str.charAt(i)]>1)
                return i;
        }
        return -1;
    }
}
