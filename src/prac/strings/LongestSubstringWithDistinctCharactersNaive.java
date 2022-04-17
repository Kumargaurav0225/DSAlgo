package prac.strings;

public class LongestSubstringWithDistinctCharactersNaive {

    public static void main(String args[]) {
        String str = "geeksforgeeks";
        int len = longestDistinct(str);
        System.out.print("The length of the longest distinct characters substring is " + len);
    }

    private static int longestDistinct(String str) {
        int res = 0, n = str.length();

        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[256];
            for (int j = i; j < n; j++) {
                if (visited[str.charAt(j)]) {
                    break;
                } else {
                    res = Math.max(res, j - i + 1);
                    visited[str.charAt(j)] = true;
                }
            }
        }
        return res;
    }
}
