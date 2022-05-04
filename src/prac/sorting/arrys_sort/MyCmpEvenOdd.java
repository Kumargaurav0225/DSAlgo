package prac.sorting.arrys_sort;

import java.util.Comparator;

public class MyCmpEvenOdd implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return a%2 - b%2;
    }
}
