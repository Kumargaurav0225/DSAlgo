package prac.observations.fastnslowpointer.easy;

import prac.observations.utilities.ListNode;

/**
 * https://leetcode.com/problems/linked-list-cycle/
 * Given the head of a LinkedList with a cycle, find the length of the cycle.
 */
public class LinkedListCycleDetection {
    /*
       Fast & Slow pointers algorithm ‘N’ is the total number of nodes in the LinkedList.
           Time complexity:     O(N) since once the slow pointer enters the cycle, the fast pointer will meet the slow
                                pointer in the same loop. Therefore, the time complexity of our algorithm will be O(N)
                                where ‘N’ is the total number of nodes in the LinkedList
           Space complexity:    O(1)
    */
    public static boolean hasCycle(ListNode head){
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        System.out.println("LinkedList has cycle: " + hasCycle(head));

        head.next.next.next.next.next.next = head.next.next;
        System.out.println("LinkedList has cycle: " + hasCycle(head));

        head.next.next.next.next.next.next = head.next.next.next;
        System.out.println("LinkedList has cycle: " + hasCycle(head));
    }
}
