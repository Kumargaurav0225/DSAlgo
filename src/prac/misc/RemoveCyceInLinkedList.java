package prac.misc;

import java.util.Objects;

// 1->2->3->4
//         ->6->5//unique find loop,if loop is there remove loop
class Intel {
    public static void main(String[] args) {
        ListNode head = new ListNode(1,null);
        ListNode node2 = new ListNode(2,null);
        head.setNext(node2);
        ListNode node3 = new ListNode(3,null);
        node2.setNext(node3);
        ListNode node4 = new ListNode(4,null);
        node3.setNext(node4);
        ListNode node5 = new ListNode(5,null);
        node4.setNext(node5);
        ListNode node6 = new ListNode(6,null);
        node5.setNext(node6);
        node6.setNext(node4);

         checkForCycle(head);
    }

    private static void checkForCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast.getNext()!=null && fast.getNext().getNext() !=null){
            slow=slow.getNext();
            fast=fast.getNext().getNext();
            if(slow == fast){
                System.out.println("Cycle Found");
                fast = head;

                while (fast != slow){
                    fast=fast.getNext();
                    System.out.println("Loop is starting");
                }
                fast = fast.getNext();
                while (fast != slow){
                    fast=fast.getNext();
                }
                fast.setNext(null);
                System.out.println("Cycle removed");
            }
        }
        System.out.println("No Cycle");
    }

}

class ListNode {
    private int data;
    private ListNode next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
    public ListNode(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return data == listNode.data && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, next);
    }
}
