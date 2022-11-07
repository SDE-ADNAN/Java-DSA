package com.adnan;

/*
  tutorial followed :- https://www.youtube.com/watch?v=pfA0VuvwpVg&ab_channel=XavierElon
        */

public class _142_Linked_List_Cycle_II {

    // class ListNode from Leetcode
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static void main(String[] args) {

    }
    public ListNode detectCycle(ListNode head) {

        // returning null if the head is null
        if(head == null || head.next == null) return null;
        // getting the intersect pointer
        ListNode intersect = intersection(head);
        if(intersect == null) return null;
        // star Listnode which is equal to head
        ListNode start = head;
        // until intersect is not equal to start
        while(intersect != start){
//            move the start and intersect with speed of one node at a time
            start = start.next;
            intersect= intersect.next;
        }
        return intersect;

    }

    public ListNode intersection(ListNode head){
        if (head == null) {
//            if LL is empty return false
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        // until slow is not equal to fast
        while (fast != null && fast.next != null ) {
            // when ever fast or fast.next is pointing to null it means we reached to the end of the
            // LL without encountering any cycle
            // and if the LL cosists of a cycle it will never reach the end node which is pointing to null

            // incrementing the slow and fast pointers
            slow = slow.next;
            fast = fast.next.next;
            if(slow== fast){
                return slow;
            }
        }
        return null;
    }
}
