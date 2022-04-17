package prac.strings;

public class AnagramSearchEfficient {
    static final int CHAR = 256;
    public static void main(String args[]) {
        String txt = "geeksforgeeks";
        String pat = "frog";
        if (isPresent(txt, pat))
            System.out.println("Anagram search found");
        else
            System.out.println("Anagram search not found");
    }
    private static boolean isPresent(String txt, String pat) {
        int[] CT = new int[CHAR];
        int[] CP = new int[CHAR];

        for (int i = 0; i < pat.length(); i++) {
            CP[pat.charAt(i)]++;
            CT[txt.charAt(i)]++;
        }

        for (int i = pat.length(); i < txt.length(); i++) {
            if (areSame(CT, CP))
                return true;
            CT[txt.charAt(i)]++;
            CT[txt.charAt(i - pat.length())]--;
        }

        return false;
    }
    private static boolean areSame(int[] ct, int[] cp) {
        for (int i = 0; i < CHAR; i++) {
            if (ct[i] != cp[i])
                return false;
        }
        return true;
    }
}
