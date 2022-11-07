package com.adnan._234th_palindrome_linked_list;

/*
234. Palindrome Linked List
Easy

11213

636

Add to List

Share
Given the head of a singly linked list, return true if it is a palindrome.

Example 1:
Input: head = [1,2,2,1]
Output: true

Example 2:
Input: head = [1,2]
Output: false


Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9


Follow up: Could you do it in O(n) time and O(1) space?
  */

//public class LinkedL {
//    public static void main(String[] args) {
//        LinkedList<Integer> LL = new LinkedList<>();
//        LL.addLast(1);
//        LL.addLast(2);
//        LL.addLast(2);
//        LL.addLast(1);
//
//    }


   public class LinkedL {
        Node head; // head of list
        Node slow_ptr, fast_ptr, second_half;

        /* Linked list Node*/
        class Node {
            char data;
            Node next;

            Node(char d) {
                data = d;
                next = null;
            }
        }

        /* Function to check if given linked list is
           palindrome or not */
        public boolean isPalindrome(Node head) {
            slow_ptr = head;
            fast_ptr = head;
            Node prev_of_slow_ptr = head;
            Node midnode = null; // To handle odd size list
            boolean res = true; // initialize result

            if (head != null && head.next != null) {
            /* Get the middle of the list. Move slow_ptr by 1
               and fast_ptr by 2, slow_ptr will have the middle
               node */
                while (fast_ptr != null && fast_ptr.next != null) {
                    fast_ptr = fast_ptr.next.next;

                /*We need previous of the slow_ptr for
                  linked lists  with odd elements */
                    prev_of_slow_ptr = slow_ptr;
                    slow_ptr = slow_ptr.next;
                }

            /* fast_ptr would become NULL when there are even elements
               in the list and not NULL for odd elements. We need to skip
               the middle node for odd case and store it somewhere so that
               we can restore the original list */
                if (fast_ptr != null) {
                    midnode = slow_ptr;
                    slow_ptr = slow_ptr.next;
                }

                // Now reverse the second half and compare it with first half
                second_half = slow_ptr;
                prev_of_slow_ptr.next = null; // NULL terminate first half
                reverse(); // Reverse the second half
                res = compareLists(head, second_half); // compare

                /* Construct the original list back */
                reverse(); // Reverse the second half again

                if (midnode != null) {
                    // If there was a mid node (odd size case) which
                    // was not part of either first half or second half.
                    prev_of_slow_ptr.next = midnode;
                    midnode.next = second_half;
                } else
                    prev_of_slow_ptr.next = second_half;
            }
            return res;
        }

        /* Function to reverse the linked list  Note that this
           function may change the head */
        public void reverse() {
            Node prev = null;
            Node current = second_half;
            Node next;
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            second_half = prev;
        }

        /* Function to check if two input lists have same data*/
       public boolean compareLists(Node head1, Node head2) {
            Node temp1 = head1;
            Node temp2 = head2;

            while (temp1 != null && temp2 != null) {
                if (temp1.data == temp2.data) {
                    temp1 = temp1.next;
                    temp2 = temp2.next;
                } else
                    return false;
            }

            /* Both are empty return 1*/
            if (temp1 == null && temp2 == null)
                return true;

        /* Will reach here when one is NULL
           and other is not */
            return false;
        }

        /* Push a node to linked list. Note that this function
           changes the head */
        public void push(char new_data) {
        /* Allocate the Node &
           Put in the data */
            Node new_node = new Node(new_data);

            /* link the old list off the new one */
            new_node.next = head;

            /* Move the head to point to new Node */
            head = new_node;
        }

        // A utility function to print a given linked list
        public void printList(Node ptr) {
            while (ptr != null) {
                System.out.print(ptr.data + "->");
                ptr = ptr.next;
            }
            System.out.println("NULL");
        }

        /* Driver program to test the above functions */
        public static void main(String[] args) {

            /* Start with the empty list */
            LinkedL llist = new LinkedL();

            char str[] = {'a', 'b', 'a', 'c', 'a', 'b', 'a'};
            String string = new String(str);
            for (int i = 0; i < 7; i++) {
                llist.push(str[i]);
                llist.printList(llist.head);
                if (llist.isPalindrome(llist.head) != false) {
                    System.out.println("Is Palindrome");
                    System.out.println("");
                } else {
                    System.out.println("Not Palindrome");
                    System.out.println("");
                }
            }
        }
    }

//}
