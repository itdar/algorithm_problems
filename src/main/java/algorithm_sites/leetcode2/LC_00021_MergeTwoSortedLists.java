package algorithm_sites.leetcode2;

public class LC_00021_MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }

        ListNode first = new ListNode();
        ListNode result = first;

        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    result.val = list1.val;
                    list1 = list1.next;
                } else {
                    result.val = list2.val;
                    list2 = list2.next;
                }
            } else if (list1 != null) {
                result.val = list1.val;
                list1 = list1.next;
            } else if (list2 != null) {
                result.val = list2.val;
                list2 = list2.next;
            }

            if (list1 != null || list2 != null) {
                result.next = new ListNode();
                result = result.next;
            }
        }

        return first;
    }

    protected static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
