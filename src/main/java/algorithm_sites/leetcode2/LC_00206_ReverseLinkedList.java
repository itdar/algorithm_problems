package algorithm_sites.leetcode2;

import java.util.ArrayList;
import java.util.List;

public class LC_00206_ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        ListNode result = new ListNode();
        ListNode node = result;
        for (int i = list.size()-1; i >= 0; --i) {
            node.val = list.get(i);
            if (i > 0) {
                node.next = new ListNode();
                node = node.next;
            }
        }

        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
