package prac.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class MovingAverageOfDataStream {
    public static void main(String[] args) {
        MovingAverage obj = new MovingAverage(4);
        double param_1 = obj.next(2);
        param_1 = obj.next(5);
        System.out.println(param_1);
    }
}

class MovingAverage {
    Deque<Integer> queue = new ArrayDeque<>();
    int size,windowSum = 0,count = 0;

    public MovingAverage(int size) {
        this.size = size;
    }

    public double next(int val) {
        ++count;
        queue.add(val);

        int tail = count > size ? queue.poll() : 0;
        windowSum = windowSum-tail+val;
        return (windowSum * 1.0) / Math.min(size,count);
    }
}
