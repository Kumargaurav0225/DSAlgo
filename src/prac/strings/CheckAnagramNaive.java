package prac.strings;

import java.util.Arrays;

public class CheckAnagramNaive {
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
        if (str1.length() != str2.length())
            return false;

        char[] c1 = str1.toCharArray();
        Arrays.sort(c1);
        str1 = new String(c1);

        char[] c2 = str2.toCharArray();
        Arrays.sort(c2);
        str2 = new String(c2);

        return str1.equals(str2);
    }
}
