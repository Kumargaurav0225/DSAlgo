package prac.strings;

public class AnagramSearchNaive {
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
        int n = txt.length();
        int m = pat.length();

        for (int i = 0; i <= (n - m); i++) {
            if (areAnagram(pat, txt, i))
                return true;
        }
        return false;
    }

    private static boolean areAnagram(String pat, String txt, int i) {
        int[] count = new int[CHAR];
        int j;
        for (j = 0; j < pat.length(); j++) {
            count[pat.charAt(j)]++;
            count[txt.charAt(i + j)]--;
        }

        for (int k = 0; k < CHAR; k++) {
            if (count[j] != 0)
                return false;
        }
        return true;
    }
}
