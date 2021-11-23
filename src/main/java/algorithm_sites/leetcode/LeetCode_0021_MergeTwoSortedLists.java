package algorithm_sites.leetcode;

public class LeetCode_0021_MergeTwoSortedLists {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode merged = new ListNode();
        ListNode current = merged;

        while (l1 != null || l2 != null) {
            if (l1 == null) {
                current.next = l2;
                current = current.next;
                l2 = l2.next;
                continue;
            }

            if (l2 == null) {
                current.next = l1;
                current = current.next;
                l1 = l1.next;
                continue;
            }

            if (l1.val <= l2.val) {
                current.next = l1;
                current = current.next;
                l1 = l1.next;
            } else {
                current.next = l2;
                current = current.next;
                l2 = l2.next;
            }
        }

        return merged.next;
    }

    public static void main(String args[]) {
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(4);
        l11.next = l12;
        l12.next = l13;

//        ListNode l21 = new ListNode();
        ListNode l21 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        ListNode l23 = new ListNode(4);
        l21.next = l22;
        l22.next = l23;

        ListNode result = mergeTwoLists(l11, l21);

        while (result.next != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

}
