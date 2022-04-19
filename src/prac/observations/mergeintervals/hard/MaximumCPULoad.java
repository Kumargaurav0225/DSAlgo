package prac.observations.mergeintervals.hard;

import prac.observations.utilities.Job;

import java.util.*;

public class MaximumCPULoad {
    public static void main(String[] args) {
        List<Job> input = new ArrayList<Job>(Arrays.asList(new Job(1, 4, 3), new Job(2, 5, 4), new Job(7, 9, 6)));
        System.out.println("Maximum CPU load at any time: " + MaximumCPULoad.findMaxCPULoad(input));

        input = new ArrayList<Job>(Arrays.asList(new Job(6, 7, 10), new Job(2, 4, 11), new Job(8, 12, 15)));
        System.out.println("Maximum CPU load at any time: " + MaximumCPULoad.findMaxCPULoad(input));

        input = new ArrayList<Job>(Arrays.asList(new Job(1, 4, 2), new Job(2, 4, 1), new Job(3, 6, 5)));
        System.out.println("Maximum CPU load at any time: " + MaximumCPULoad.findMaxCPULoad(input));
    }

    private static int findMaxCPULoad(List<Job> jobs) {
        if (jobs == null || jobs.isEmpty())
            return 0;

        int currentLoad = 0, maxLoad = 0;
        Collections.sort(jobs, (a, b) -> Integer.compare(a.start, b.start));
        PriorityQueue<Job> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a.end, b.end));

        for (Job currentJob : jobs) {
            while (!minHeap.isEmpty() && currentJob.start > minHeap.peek().end)
                currentLoad -= minHeap.poll().cpuLoad;

            minHeap.offer(currentJob);
            currentLoad += currentJob.cpuLoad;

            maxLoad = Math.max(maxLoad, currentLoad);
        }
        return maxLoad;
    }
}
