package prac.sorting.arrys_sort;

// A sample Java program to implementing
// Comparable alongside Arrays.sort().

import java.util.Arrays;

// Main class
class Test
{
    public static void main(String[] args)
    {
        // Array of 3 objects
        Point arr[] = {
                new Point(10, 20),
                new Point(3, 12),
                new Point(5, 7) };

        // Sorting the object containing array
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++)
            System.out.println(
                    arr[i].x + " " + arr[i].y);
    }
}
