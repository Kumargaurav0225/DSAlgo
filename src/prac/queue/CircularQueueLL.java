package prac.queue;

class Node{
    public Node nextNode;
    public int value;

    public Node(int value) {
        this.nextNode = null;
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "nextNode=" + nextNode +
                ", value=" + value +
                '}';
    }
}
public class CircularQueueLL {

    private Node head,tail;
    private int count;
    private int capacity;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public CircularQueueLL(int k) {
        this.capacity = k;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value){
        if(this.count == this.capacity)
            return false;

        Node newNode = new Node(value);
        if(this.count == 0){
            head = tail = newNode;
        }else {
            this.tail.setNextNode(newNode);
            this.tail = newNode;
        }
        this.count =+ 1;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue(){
        if (this.count == 0)
            return false;

        this.head = this.head.getNextNode();
        this.count -= 1;
        return true;
    }

    /** Get the front item from the queue. */
    public int front(){
        if(this.count == 0) return -1;
        return this.head.getValue();
    }

    /** Get the last item from the queue. */
    public int rear(){
        if (this.count == 0) return -1;
        return this.tail.getValue();
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return (this.count == 0);
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return (this.count == this.capacity);
    }

    @Override
    public String toString() {
        return "CircularQueueLL{" +
                "head=" + head +
                ", tail=" + tail +
                ", count=" + count +
                ", capacity=" + capacity +
                '}';
    }
}

class CircularQueueLinkedList {
    public static void main(String[] args) {
        CircularQueueLL obj = new CircularQueueLL(5);

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
