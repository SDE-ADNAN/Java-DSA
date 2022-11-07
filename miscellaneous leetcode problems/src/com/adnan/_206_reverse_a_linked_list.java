package com.adnan;
import java.util.*;

/*
206. Reverse Linked List
Easy

13543

233

Add to List

Share
Given the head of a singly linked list, reverse the list, and return the reversed list.



Example 1:


Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:


Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []


Constraints:

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000


Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
*/

public class _206_reverse_a_linked_list {
    public static void main(String[] args) {
        // Declaring linkedlist without any initial size
        LinkedList<Integer> linkedli = new LinkedList<Integer>();

        // Appending elements at the end of the list
        linkedli.add(1);
        linkedli.add(2);
        linkedli.add(3);
        linkedli.add(4);
        linkedli.add(5);
        linkedli.add(6);


//        linkedli.add(new Integer(1));
//        linkedli.add(new Integer(2));
//        linkedli.add(new Integer(3));
//        linkedli.add(new Integer(4));
//        linkedli.add(new Integer(5));
        System.out.println("Elements before reversing: " + linkedli);

        // Calling user defined function for reversing
        linkedli = reverseLinkedList(linkedli);
        System.out.println("\nElements after reversing: " + linkedli);
    }
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> llist)
    {
        for (int i = 0; i < llist.size() / 2; i++) {
            Integer temp = llist.get(i);
//            System.out.println("1 == "+llist);
            llist.set(i, llist.get(llist.size() - i - 1));
            System.out.println("1 == "+llist);
            llist.set(llist.size() - i - 1, temp);
            System.out.println("2 == "+llist);
        }

        // Return the reversed arraylist
        return llist;
    }
}
