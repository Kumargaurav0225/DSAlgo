package prac.observations.mergeintervals.medium;

import java.util.LinkedList;

public class InsertInterval {
    public static void main(String[] args) {
        int[][] input = new int[][]{{1,3},{6,9}};
        int[] newInterval = new int[]{2,5};
        
        int[][] result = insertInterval(input,newInterval);
        System.out.print("[");
        for (int[] i: result) {
            System.out.print("["+i[0]+","+i[1]+"]");
            System.out.print(",");
        }
        System.out.print("]");
    }

    private static int[][] insertInterval(int[][] intervals, int[] newInterval) {
        LinkedList<int[]> ans = new LinkedList<>();
        int i = 0;

        while (i<intervals.length && intervals[i][1]<newInterval[0]){
            ans.add(intervals[i]);
            i++;
        }

        while (i<intervals.length && intervals[i][0]<newInterval[1]){

            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            i++;

        }
        ans.add(newInterval);

        while (i<intervals.length){
            ans.add(intervals[i]);
            i++;
        }

        return ans.toArray(new int[ans.size()][2]);
    }
}
