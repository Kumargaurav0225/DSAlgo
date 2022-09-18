package prac.recursion;

public class Permutations {
    public static void main(String[] args) {
        String str = "ABC";
        permute(str, 0);
    }

    private static void permute(String str, int idx) {
        if (idx == str.length() - 1) {
            System.out.println(str);
        } else {
            for (int j = idx; j <= str.length() - 1; j++) {
                str = swap(str, idx, j);
                permute(str, idx + 1);
                str = swap(str, idx, j);
            }
        }
    }

    private static String swap(String str, int idx, int j) {
        char[] charArr = str.toCharArray();
        char temp = charArr[idx];
        charArr[idx] = charArr[j];
        charArr[j] = temp;
        return String.valueOf(charArr);
    }
}
