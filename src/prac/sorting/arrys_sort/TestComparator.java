package prac.sorting.arrys_sort;

// A sample Java program to implementing
// Comparator alongside Arrays.sort().
import java.util.*;
import java.lang.*;

// Main class
class TestComparator
{
    public static void main(String[] args)
    {
        // Array of 3 objects
        Point arr[] = {
                new Point(10, 20),
                new Point(3, 12),
                new Point(5, 7) };

        // Sorting the object containing the array
        // by passing the array and object MyCmp
        Arrays.sort(arr, new MyCmp());

        // Displaying the sorted array
        for(int i = 0; i < arr.length; i++)
            System.out.println(
                    arr[i].x + " " + arr[i].y);
    }
}
