package prac.strings;

public class LeftmostNonRepeatingCharacterEfficient1 {

    public static void main(String args[]) {
        String str = "geeksforgeeks";
        System.out.println("Index of leftmost non-repeating element:");
        System.out.println(nonRep(str));
    }

    private static int nonRep(String str) {
        final int CHAR = 256;
        int[] count = new int[CHAR];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1)
                return i;
        }
        return -1;
    }
}
