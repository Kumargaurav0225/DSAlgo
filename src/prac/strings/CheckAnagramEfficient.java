package prac.strings;

public class CheckAnagramEfficient {
    public static void main(String args[]) {
        String str1 = "abaac";
        String str2 = "aacba";

        if (areAnagram(str1, str2))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");
    }

    private static boolean areAnagram(String str1, String str2) {
        final int CHAR=256;
        int[] count = new int[CHAR];

        if (str1.length() != str2.length())
            return false;

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0)
                return false;
        }

        return true;
    }
}
