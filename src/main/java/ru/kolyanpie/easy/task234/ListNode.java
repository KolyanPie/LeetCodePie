package ru.kolyanpie.easy.task234;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[").append(val);
        ListNode next = this.next;
        while (next != null) {
            builder.append(", ").append(next.val);
            next = next.next;
        }
        builder.append("]");
        return builder.toString();
    }
}