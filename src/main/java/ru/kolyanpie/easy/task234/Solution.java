package ru.kolyanpie.easy.task234;

//https://leetcode.com/problems/palindrome-linked-list/?envType=daily-question&envId=2024-03-25
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode tail = head;
        int count = 1;
        while (tail.next != null) {
            tail = tail.next;
            count++;
        }
        if (count == 2) {
            return head.val == head.next.val;
        }
        if (count == 3) {
            return head.val == head.next.next.val;
        }
        tail = head;
        for (int i = 0; i < (count + 1) / 2; i++) {
            tail = tail.next;
        }
        ListNode next = tail.next;
        ListNode current = tail;
        current.next = null;
        while (next.next != null) {
            current = next;
            next = current.next;
            current.next = tail;
            tail = current;
        }
        next.next = current;
        tail = next;
        for (int i = 0; i < count / 2; i++) {
            if (head.val != tail.val) {
                return false;
            }
            head = head.next;
            tail = tail.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(0);
        ListNode cur = head;
        for (int i = 1; i < 5; i++) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        for (int i = 4; i >= 0; i--) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        System.out.println(head);
        System.out.println(solution.isPalindrome(head));
    }
}
