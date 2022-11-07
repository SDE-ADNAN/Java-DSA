package com.adnan;

/*
141. Linked List Cycle
Easy

9669

864

Add to List

Share
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.



Example 1:


Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
Example 2:


Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
Example 3:


Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.


Constraints:

The number of the nodes in the list is in the range [0, 104].
-105 <= Node.val <= 105
pos is -1 or a valid index in the linked-list.

*/


/*
tutorial used :- https://www.youtube.com/watch?v=6OrZ4wAy4uE&ab_channel=NickWhite

approach (two pointer):-
The optimal method being the use of two pointers.
Here we use 2 pointers both starting from the head of the list.
The first pointer holds the present node in the list and the second
pointer holds the position of the node that is 2 nodes away from the current node.
This loop iterates till the end and if there is no cycle present then returns
false, else returns true.

     */


public class _141_Linked_List_Cycle {
    public static void main(String[] args) {

    }

    // class ListNode from Leetcode
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
         val = x;
          next = null;
      }
    }
    public boolean hasCycle(ListNode head) {
        if (head == null) {
//            if LL is empty return false
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        // until slow is not equal to fast
        while (slow != fast) {
            // when ever fast or fast.next is pointing to null it means we reached to the end of the
            // LL without encountering any cycle
            // and if the LL cosists of a cycle it will never reach the end node which is pointing to null
            if (fast == null || fast.next == null) {
                return false;
            }
            // incrementing the slow and fast pointers
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

}
