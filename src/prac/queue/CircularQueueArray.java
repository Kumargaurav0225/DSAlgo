package prac.queue;

import java.util.Arrays;

class MyCircularQueue {

    private int[] queue;
    private int headIndex;
    private int count;
    private int capacity;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public MyCircularQueue(int k) {
        this.capacity = k;
        this.queue = new int[k];
        this.headIndex = 0;
        this.count = 0;
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (this.count == this.capacity)
            return false;
        this.queue[(this.headIndex + this.count) % this.capacity] = value;
        this.count += 1;
        return true;
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (this.count == 0)
            return false;
        this.headIndex = (this.headIndex + 1) % this.capacity;
        this.count -= 1;
        return true;
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        if (this.count == 0)
            return -1;
        return this.queue[this.headIndex];
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        if (this.count == 0)
            return -1;
        int tailIndex = (this.headIndex + this.count - 1) % this.capacity;
        return this.queue[tailIndex];
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return (this.count == 0);
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        return (this.count == this.capacity);
    }

    @Override
    public String toString() {
        return "MyCircularQueue{" +
                "queue=" + Arrays.toString(queue) +
                ", headIndex=" + headIndex +
                ", count=" + count +
                ", capacity=" + capacity +
                '}';
    }
}

public class CircularQueueArray {
    public static void main(String[] args) {
        MyCircularQueue obj = new MyCircularQueue(5);

        boolean param_1 = obj.enQueue(4);
        System.out.println(obj.toString());

        boolean param_2 = obj.enQueue(5);
        System.out.println(obj.toString());

        boolean param_6 = obj.deQueue();
        System.out.println(obj.toString());

        boolean param_3 = obj.enQueue(3);
        System.out.println(obj.toString());

        boolean param_4 = obj.enQueue(2);
        System.out.println(obj.toString());

        boolean param_5 = obj.enQueue(1);
        System.out.println(obj.toString());

        boolean param_7 = obj.enQueue(10);
        System.out.println(obj.toString());

    }
}
