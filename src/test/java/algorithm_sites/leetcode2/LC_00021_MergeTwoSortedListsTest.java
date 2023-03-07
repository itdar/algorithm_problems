package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;
import algorithm_sites.leetcode2.LC_00021_MergeTwoSortedLists.ListNode;
import org.junit.jupiter.api.Test;

class LC_00021_MergeTwoSortedListsTest {

    private LC_00021_MergeTwoSortedLists lc = new LC_00021_MergeTwoSortedLists();

    @Test
    void solutionTest1() {
        ListNode list13 = new ListNode(4);
        ListNode list12 = new ListNode(2, list13);
        ListNode list11 = new ListNode(1, list12);

        ListNode list23 = new ListNode(4);
        ListNode list22 = new ListNode(3, list23);
        ListNode list21 = new ListNode(1, list22);

        ListNode listNode = lc.mergeTwoLists(list11, list21);

        ListNode result = listNode;
        assertThat(result.val).isEqualTo(1);
        result = result.next;
        assertThat(result.val).isEqualTo(1);
        result = result.next;
        assertThat(result.val).isEqualTo(2);
        result = result.next;
        assertThat(result.val).isEqualTo(3);
        result = result.next;
        assertThat(result.val).isEqualTo(4);
        result = result.next;
        assertThat(result.val).isEqualTo(4);
    }
    @Test
    void solutionTest2() {
        ListNode list1 = null;
        ListNode list2 = null;

        ListNode listNode = lc.mergeTwoLists(list1, list2);

        assertThat(listNode).isNull();
    }
    @Test
    void solutionTest3() {
        ListNode list1 = null;
        ListNode list2 = new ListNode(0);

        ListNode listNode = lc.mergeTwoLists(list1, list2);

        assertThat(listNode.val).isZero();
        assertThat(listNode.next).isNull();
    }

}
