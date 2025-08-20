package com.sandip.LinkLists;

public class intersect {

    public static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int lengthA = 0;
        int lengthB = 0;
        while (tempA != null) {
            lengthA++;
            tempA = tempA.next;

        }
        while (tempB != null) {
            lengthB++;
            tempB = tempB.next;

        }
        tempA = headA;
        tempB = headB;
        if (lengthB > lengthA) {
            int steps = lengthB - lengthA;
            for (int i = 1; i <= steps; i++) {
                tempB = tempB.next;

            }
        } else {
            int steps = lengthA - lengthB;
            for (int i = 1; i <= steps; i++) {
                tempA = tempA.next;

            }
        }

        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;


        }
        return tempA;

    }

    public static void main(String[] args) {


    }
}
