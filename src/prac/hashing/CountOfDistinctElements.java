package prac.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountOfDistinctElements {

    public static void main(String[] args) {
        int arr[] = new int[]{15, 16, 27, 27, 28, 15};
        int n = arr.length;
        System.out.println(countDistinct(arr, n));
    }

    private static int countDistinct(int[] arr, int n) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr)
            set.add(i);

        return set.size();
    }
}
