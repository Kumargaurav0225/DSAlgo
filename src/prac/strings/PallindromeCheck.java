package prac.strings;

public class PallindromeCheck {

    public static void main(String[] args) {
        String s1 = "ABBA";
        String s2 = "ABCBA";
        String s3 = "abcd";

        System.out.println(isPallindrome(s1));
        System.out.println(isPallindrome(s2));
        System.out.println(isPallindrome(s3));

        System.out.println();

        System.out.println(isPallindromeEfficient(s1));
        System.out.println(isPallindromeEfficient(s2));
        System.out.println(isPallindromeEfficient(s3));
    }
    private static boolean isPallindrome(String str) {
        if (str.equals(new StringBuilder(str).reverse().toString()))
            return true;
        return false;
    }
    private static boolean isPallindromeEfficient(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
