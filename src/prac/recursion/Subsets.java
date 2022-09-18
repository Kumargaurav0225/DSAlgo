package prac.recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static void main(String[] args) {
        String str = "ABC";
        List<String> res = new ArrayList<>();
        List<String> op = printSub(str, "", 0, res);
        System.out.println(op);
    }

    private static List<String> printSub(String str, String curr, int idx, List<String> result) {

        if (str.length() == idx) {
            result.add(curr);
            return result;
        }

        printSub(str, curr, idx + 1,result );
        printSub(str, curr + str.charAt(idx), idx + 1,result );

        return result;
    }
}
