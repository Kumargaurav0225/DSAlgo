package prac.recursion;

public class Subsets {

    public static void main(String[] args) {
        String str = "ABC";
        printSub(str, "", 0);
    }

    private static void printSub(String str, String curr, int idx) {

        if (str.length() == idx) {
            System.out.println(curr + " ");
            return;
        }

        printSub(str, curr, idx + 1);
        printSub(str, curr + str.charAt(idx), idx + 1);
    }
}
