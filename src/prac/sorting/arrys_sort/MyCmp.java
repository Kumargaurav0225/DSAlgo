package prac.sorting.arrys_sort;

import java.util.Comparator;

// This class implements
// Comparator interface to compare
class MyCmp implements Comparator<Point> {
    // Sorts the Point objects according
    // to x-coordinates in natural order
    public int compare(Point p1, Point p2) {
        return p1.x - p2.x;
    }
}
