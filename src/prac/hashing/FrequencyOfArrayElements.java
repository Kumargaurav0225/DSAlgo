package prac.hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArrayElements {
    public static void main(String[] args) {
        int arr[] = new int[]{15, 16, 27, 27, 28, 15};
        int n = arr.length;

        countFreq(arr, n);
    }

    private static void countFreq(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
                map.put(i, 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
    }
}
