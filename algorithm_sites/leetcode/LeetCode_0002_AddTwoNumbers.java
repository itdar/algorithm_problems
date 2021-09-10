package algorithm_sites.leetcode;

public class LeetCode_0002_AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode current = result;

        int sum;
        int val1;
        int val2;
        boolean upDigit = false;
        while (l1 != null || l2 != null) {
            val1 = (l1 != null) ? l1.val : 0;
            val2 = (l2 != null) ? l2.val : 0;
            sum = val1 + val2;

            if (upDigit) {
                sum += 1;
            }
            upDigit = false;

            if (sum > 9) {
                upDigit = true;
                sum -= 10;
            }

            current.next = new ListNode(sum);
            current = current.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (upDigit) {
            current.next = new ListNode(1);
        }

        return result.next;
    }

    public static void main(String[] args) {
        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        ListNode l13 = new ListNode(3);
//        ListNode l13 = new ListNode(9);
        l11.next = l12;
        l12.next = l13;

//        ListNode l21 = new ListNode();
        ListNode l21 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        ListNode l23 = new ListNode(4);
//        ListNode l24 = new ListNode(9);
        l21.next = l22;
        l22.next = l23;
//        l23.next = l24;

        ListNode result = addTwoNumbers(l11, l21);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
