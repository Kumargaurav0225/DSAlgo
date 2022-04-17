package prac.strings;

public class CharFrequency {

    public static void main(String[] args) {
        String s = "aaeeksforgeeks";
        charFrequency(s);
    }

    private static void charFrequency(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++)
            count[s.charAt(i)-'a']++;

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0)
                System.out.println("Frequency of "+((char)('a'+i))+" : "+count[i]);
        }
    }
}
