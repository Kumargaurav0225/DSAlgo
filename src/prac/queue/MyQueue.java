package prac.queue;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    //store elements
    private List<Integer> data;

    // a pointer to indicate the start position
    private int start;

    public MyQueue() {
        this.data = new ArrayList<>();
        this.start = 0;
    }

    /**
     * Insert an element into the queue. Return true if the operation is successful.
     */
    public boolean enQueue(int x) {
        data.add(x);
        return true;
    }

    /**
     * Delete an element from the queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (isEmpty())
            return false;
        start++;
        return true;
    }

    public int front() {
        return data.get(start);
    }

    public boolean isEmpty() {
        return start >= data.size();
    }
}

class Main{
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enQueue(5);
        q.enQueue(3);
        if (!q.isEmpty()) {
            System.out.println(q.front());
        }
        q.deQueue();
        if (!q.isEmpty()) {
            System.out.println(q.front());
        }
        q.deQueue();
        if (!q.isEmpty()) {
            System.out.println(q.front());
        }
    }
}
