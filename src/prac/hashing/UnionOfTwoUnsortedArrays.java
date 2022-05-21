package prac.hashing;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoUnsortedArrays {

    public static void main (String[] args) {
        int arr1[] = new int[]{2, 8, 3, 5, 6};
        int arr2[] = new int[]{4, 8, 3, 6, 1};

        System.out.println(unionSize(arr1,arr2));
    }

    private static int unionSize(int[] arr1,int[] arr2) {
        Set<Integer> set = new HashSet<>();

        for (int i: arr1)
            set.add(i);
        for (int i: arr2)
            set.add(i);

        System.out.println(set);
        return set.size();
    }
}
