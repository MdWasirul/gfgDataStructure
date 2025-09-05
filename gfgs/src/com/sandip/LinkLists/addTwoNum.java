package com.sandip.LinkLists;

public class addTwoNum {


    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy node to start the result list
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;  // pointer to build result
        int carry = 0;

        // Loop until both lists are finished and no carry remains
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            // Add value from l1 if present
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            // Add value from l2 if present
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Update carry for next step
            carry = sum / 10;

            // Create new node with digit value (sum % 10)
            curr.next = new ListNode(sum % 10);

            // Move pointer
            curr = curr.next;
        }

        // Return result list (skip dummy node)
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode a = new ListNode(4);
        ListNode b = new ListNode(3);
        l1.next = a;
        a.next = b;

        ListNode l2 = new ListNode(5);
        ListNode c = new ListNode(6);
        ListNode d = new ListNode(4);
        l2.next = c;
        c.next = d;

        l1 = addTwoNumbers(l1, l2);
        System.out.println(l1.val);


    }
}
