package prac.recursion;

public class PallindromeString {
    public static void main(String[] args) {

        String s1 = "aba";
        System.out.println(isPallindrome(s1, 0, s1.length() - 1));

        String s2 = "abba";
        System.out.println(isPallindrome(s2, 0, s2.length() - 1));

        String s3 = "geeks";
        System.out.println(isPallindrome(s3, 0, s3.length() - 1));

    }

    private static boolean isPallindrome(String s, int start, int end) {
        if (start >= end)
            return true;
        return (s.charAt(start) == s.charAt(end) && isPallindrome(s, start + 1, end - 1));
    }
}
