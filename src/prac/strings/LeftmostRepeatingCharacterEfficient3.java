package prac.strings;

public class LeftmostRepeatingCharacterEfficient3 {

    public static void main(String args[])
    {   String str = "geeksforgeeks";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost(str));
    }

    private static int leftMost(String str) {
        boolean[] visited = new boolean[256];
        int res = -1;

        for (int i = str.length()-1 ; i >= 0 ; i--) {
            if (visited[str.charAt(i)]){
                res = i;
            }else {
                visited[str.charAt(i)] = true;
            }
        }
        return res;
    }
}
