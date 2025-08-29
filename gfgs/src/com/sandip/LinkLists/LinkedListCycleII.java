package com.sandip.LinkLists;

public class LinkedListCycleII {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    static ListNode reverseBetween(ListNode head, int left, int right) {
        // create a dummy node to mark the head of this list
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // make markers for currentNode and for the node before reversing
        ListNode leftPre = dummy;
        ListNode currNode = head;

        for (int i = 0; i < left - 1; i++) {
            leftPre = leftPre.next;
            currNode = currNode.next;
        }

        // make a marker to node where we start reversing
        ListNode subListHead = currNode;

        ListNode preNode = null;
        for (int i = 0; i <= right - left; i++) {
            ListNode nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }

        // Join the pieces
        leftPre.next = preNode;
        subListHead.next = currNode;

        return dummy.next;
    }

    //[3,2,0,-4]
    //[1,2,3,4,5]
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        head.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        head = reverseBetween(head, 3, 5);

    }


}
