package prac.sorting.arrys_sort;

// A user-defined Point class implementing
// Comparable interface
class Point implements Comparable<Point> {
    int x, y;

    // Costructor intialising x & y
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // compareTo() function defining the
    // nature of sorting i.e., according to
    // x-coordinate
    public int compareTo(Point P) {
        // Comparing two objects by
        // Subtracting the passed object
        // from current object
        return this.x - P.x;
    }
}
