package ru.kolyanpie.medium.task1669;

//https://leetcode.com/problems/merge-in-between-linked-lists/?envType=daily-question&envId=2024-03-20
public class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prevA = list1;
        for (int i = 0; i < a - 1; i++) {
            prevA = prevA.next;
        }
        ListNode postB = prevA.next;
        prevA.next = list2;
        for (int i = 0; i < b - a + 1; i++) {
            postB = postB.next;
        }
        ListNode last2 = list2;
        while (last2.next != null) {
            last2 = last2.next;
        }
        last2.next = postB;
        return list1;
    }
}
