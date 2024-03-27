package ru.kolyanpie.easy.task206;

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        ListNode current = head;
        current.next = null;
        while (next.next != null) {
            current = next;
            next = current.next;
            current.next = head;
            head = current;
        }
        next.next = current;
        return next;
    }
}
