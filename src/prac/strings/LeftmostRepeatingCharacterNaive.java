package prac.strings;

public class LeftmostRepeatingCharacterNaive {

    public static void main(String args[])
    {   String str = "geeksforgeeks";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost(str));
    }

    private static int leftMost(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    return i;
            }
        }
        return -1;
    }
}
