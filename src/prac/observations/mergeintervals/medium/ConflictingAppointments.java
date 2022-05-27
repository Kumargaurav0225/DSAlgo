package prac.observations.mergeintervals.medium;

/**
 * https://leetcode.com/problems/meeting-rooms/
 * Given an array of intervals representing ‘N’ appointments, find out if a person can attend all the appointments.
 * Appointments:   [[1,4], [2,5], [7,9]]
 * Output:         false
 * Explanation:    Since [1,4] and [2,5] overlap, a person cannot attend both of these appointments.
 *
 * Appointments:   [[6,7], [2,4], [8,12]]
 * Output:         true
 * Explanation:    None of the appointments overlap, therefore a person can attend all of them.
 *
 * Appointments:   [[4,5], [2,3], [3,6]]
 * Output:         false
 * Explanation:    Since [4,5] and [3,6] overlap, a person cannot attend both of these appointments.
 */

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class ConflictingAppointments {
    public static void main(String[] args) {
        int[][] appointments = new int[][]{{1,4},{2,5},{7,9}};
        int[][] appointments2 = new int[][]{{6,7},{2,4},{8,12}};

        System.out.println(isPossibleToAttendAllMeeting(appointments));
        System.out.println(isPossibleToAttendAllMeeting(appointments2));
    }

    private static boolean isPossibleToAttendAllMeeting(int[][] appointments) {

        LinkedList<int[]> list = new LinkedList<>();

        for (int[] appointment : appointments) {
            list.add(appointment);
        }
        Collections.sort(list, Comparator.comparingInt(a -> a[0]));

        for (int i = 0;i<list.size()-1;i++) {
            if (list.get(i+1)[0]<list.get(i)[1])
                return false;
        }
        return true;
    }
}
