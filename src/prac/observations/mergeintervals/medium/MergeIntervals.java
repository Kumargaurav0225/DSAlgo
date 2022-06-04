package prac.observations.mergeintervals.medium;

/**
 * https://leetcode.com/problems/merge-intervals/
 * Given a list of intervals, merge all the overlapping intervals to produce a list that has only mutually exclusive
 * intervals.
 * Input:          [[1,4], [2,5], [7,9]]
 * Output:         [[1,5], [7,9]]
 * Explanation:    Since the first two intervals [1,4] and [2,5] overlap, we merged them into
 * one [1,5].
 * <p>
 * Input:          [[6,7], [2,4], [5,9]]
 * Output:         [[2,4], [5,9]]
 * Explanation:    Since the intervals [6,7] and [5,9] overlap, we merged them into one [5,9].
 * <p>
 * Input:          [[1,4], [2,6], [3,5]]
 * Output:         [[1,6]]
 * Explanation:    Since all the given intervals overlap, we merged them into one.
 */


import prac.observations.utilities.Interval;

import java.util.*;

public class MergeIntervals {

    /*
        Merge Intervals algorithm where ‘N’ is the total number of intervals
            Time complexity:    O(N *  logN) as iterating the intervals only once which will take O(N), in the beginning
                                though, since we need to sort the intervals, our algorithm will take O(N *  logN).
            Space complexity:   O(N) as we need to return a list containing all the merged intervals. We will also need
                                O(N) space for sorting. For Java, depending on its version, Collections.sort() either
                                uses Merge sort or Timsort, and both these algorithms need O(N) space. Overall, our
                                algorithm has a space complexity of O(N).
     */
    public static List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, Comparator.comparingInt(a -> a.start));
        LinkedList<Interval> mergedIntervals = new LinkedList<Interval>();
        for (Interval interval : intervals) {
            if (mergedIntervals.isEmpty() || mergedIntervals.getLast().end < interval.start) {
                mergedIntervals.add(interval);
            } else {
                mergedIntervals.getLast().end = Math.max(mergedIntervals.getLast().end, interval.end);
            }
        }
        return mergedIntervals;
    }

    public static void main(String[] args) {
        List<Interval> input = new ArrayList<Interval>();
        input.add(new Interval(1, 4));
        input.add(new Interval(2, 5));
        input.add(new Interval(7, 9));
        System.out.print("Merged intervals: ");
        for (Interval interval : MergeIntervals.merge(input))
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();

        input = new ArrayList<Interval>();
        input.add(new Interval(6, 7));
        input.add(new Interval(2, 4));
        input.add(new Interval(5, 9));
        System.out.print("Merged intervals: ");
        for (Interval interval : MergeIntervals.merge(input))
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();

        input = new ArrayList<Interval>();
        input.add(new Interval(1, 4));
        input.add(new Interval(2, 6));
        input.add(new Interval(3, 5));
        System.out.print("Merged intervals: ");
        for (Interval interval : MergeIntervals.merge(input))
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();
    }
}