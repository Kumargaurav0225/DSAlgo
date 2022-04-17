package prac.strings;

public class LeftmostNonRepeatingCharacterNaive {

    public static void main(String args[])
    {   String str = "geeksforgeeks";
        System.out.println("Index of leftmost non-repeating element:");
        System.out.println(nonRep(str));
    }
    private static int nonRep(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean isRepeated = false;
            for (int j = i; j < str.length() ; j++) {
                if ( i != j && (str.charAt(i) == str.charAt(j)))
                    isRepeated = true;
            }

            if (!isRepeated){
                return i;
            }
        }
        return -1;
    }
}
