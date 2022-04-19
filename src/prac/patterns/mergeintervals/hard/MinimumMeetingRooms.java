package prac.patterns.mergeintervals.hard;

import prac.patterns.utilities.Meeting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/meeting-rooms-ii/
 * Given a list of intervals representing the start and end time of ‘N’ meetings, find the minimum number of rooms
 * required to hold all the meetings.
 * Meetings:           [[1,4], [2,5], [7,9]]
 * Output:             2
 * Explanation:        Since [1,4] and [2,5] overlap, we need two rooms to hold these two meetings. [7,9] can
 * occur in any of the two rooms later.
 * <p>
 * Meetings:           [[6,7], [2,4], [8,12]]
 * Output:             1
 * Explanation:        None of the meetings overlap, therefore we only need one room to hold all meetings.
 * <p>
 * Meetings:           [[1,4], [2,3], [3,6]]
 * Output:             2
 * Explanation:        Since [1,4] overlaps with the other two meetings [2,3] and [3,6], we need two rooms to
 * hold all the meetings.
 * <p>
 * Meetings:           [[4,5], [2,3], [2,4], [3,5]]
 * Output:             2
 * Explanation:        We will need one room for [2,3] and [3,5], and another room for [2,4] and [4,5].
 */

public class MinimumMeetingRooms {
    /*
            Merge Intervals algorithm where ‘N’ is the total number of meetings
                Time complexity:    O(N *  logN) due to the sorting that we did in the beginning. Also, while iterating the
                                    meetings we might need to poll/offer meeting to the priority queue. Each of these
                                    operations can take O(logN)
                Space complexity:   O(N) which is required for sorting. Also, in the worst case scenario, we’ll have to
                                    insert all the meetings into the Min Heap (when all meetings overlap) which will also
                                    take O(N)
         */
    public static void main(String[] args) {
        List<Meeting> input = new ArrayList<Meeting>() {
            {
                add(new Meeting(4, 5));
                add(new Meeting(2, 3));
                add(new Meeting(2, 4));
                add(new Meeting(3, 5));
            }
        };
        int result = MinimumMeetingRooms.findMinimumMeetingRooms(input);
        System.out.println("Minimum meeting rooms required: " + result);

        input = new ArrayList<Meeting>() {
            {
                add(new Meeting(1, 4));
                add(new Meeting(2, 5));
                add(new Meeting(7, 9));
            }
        };
        result = MinimumMeetingRooms.findMinimumMeetingRooms(input);
        System.out.println("Minimum meeting rooms required: " + result);

        input = new ArrayList<Meeting>() {
            {
                add(new Meeting(6, 7));
                add(new Meeting(2, 4));
                add(new Meeting(8, 12));
            }
        };
        result = MinimumMeetingRooms.findMinimumMeetingRooms(input);
        System.out.println("Minimum meeting rooms required: " + result);

        input = new ArrayList<Meeting>() {
            {
                add(new Meeting(1, 4));
                add(new Meeting(2, 3));
                add(new Meeting(3, 6));
            }
        };
        result = MinimumMeetingRooms.findMinimumMeetingRooms(input);
        System.out.println("Minimum meeting rooms required: " + result);

        input = new ArrayList<Meeting>() {
            {
                add(new Meeting(2, 3));
                add(new Meeting(2, 4));
                add(new Meeting(5, 7));
                add(new Meeting(6, 8));
            }
        };
        result = MinimumMeetingRooms.findMinimumMeetingRooms(input);
        System.out.println("Minimum meeting rooms required: " + result);
    }

    private static int findMinimumMeetingRooms(List<Meeting> meetings) {
        if (meetings == null || meetings.isEmpty())
            return 0;

        Collections.sort(meetings,(a,b) -> Integer.compare(a.start,b.start));
        PriorityQueue<Meeting> minHeap = new PriorityQueue<>((a,b)->Integer.compare(a.end, b.end));

        minHeap.add(meetings.get(0));
        for (int i = 1; i < meetings.size()-1; i++) {
            Meeting current = meetings.get(i);
            Meeting ealiest = minHeap.remove();
            if (current.start >= ealiest.end){
                ealiest.end = current.end;
            }else {
                minHeap.add(current);
            }
            minHeap.add(ealiest);
        }

        return minHeap.size();
    }

}
