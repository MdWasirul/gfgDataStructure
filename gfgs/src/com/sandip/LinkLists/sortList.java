package com.sandip.LinkLists;

import java.util.ArrayList;
import java.util.Collections;
// LeetCode SortList 148......

public class sortList {

    static class ListNode {
        int val;
        ListNode next;


        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode sortList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(arr);
        // Step 3: Rebuild linked list
        temp = head;
        int i = 0;
        while (temp != null) {
            temp.val = arr.get(i);
            i++;
            temp = temp.next;
        }
        return head;

    }

    static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    //Efficient Solution:-

    public static ListNode sortListEff(ListNode head) {
        if (head == null) return head;
        if (head.next == null) return head;
        ListNode middle = findMiddle(head);
        ListNode leftHead = head;
        ListNode rightHead = middle.next;
        middle.next = null;

        leftHead = sortListEff(leftHead);
        rightHead = sortListEff(rightHead);

        return mergeTwoL(leftHead, rightHead);


    }


    static ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static ListNode mergeTwoL(ListNode a, ListNode b) {
        if (a == null) return b;
        if (b == null) return a;
        ListNode head = null, tail = null;
        if (a.val <= b.val) {
            head = tail = a;
            a = a.next;
        } else {
            head = tail = b;
            b = b.next;
        }

        //    10 -> 20 -> 30;
        //    5 -> 35;
        while (a != null && b != null) {
            if (a.val <= b.val) {
                tail.next = a;
                tail = a;
                a = a.next;
            } else {
                tail.next = b;
                tail = b;
                b = b.next;

            }
        }
        if (a == null) {
            tail.next = b;
        } else {
            tail.next = a;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(3);
        head.next = a;
        a.next = b;
        b.next = c;
//            printList(head);
//            System.out.println();
//            head = sortList(head);
//            printList(head);
//            System.out.println();
//        System.out.println(findMiddle(head));
        head = sortListEff(head);
        printList(head);


    }


}
