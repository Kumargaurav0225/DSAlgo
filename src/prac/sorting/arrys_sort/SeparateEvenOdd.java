package prac.sorting.arrys_sort;

import java.util.Arrays;

public class SeparateEvenOdd {
    public static void main(String[] args) {
        // Integer array
        Integer[] arr = {5, 20, 10, 3, 12};

        // Sorting arrays by passing
        // arr and MyCmp object
        Arrays.sort(arr,new MyCmpEvenOdd());

        // Displaying the sorted array
        System.out.println(Arrays.toString(arr));
    }
}
