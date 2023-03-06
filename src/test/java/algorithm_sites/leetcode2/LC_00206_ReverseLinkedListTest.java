package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;

import algorithm_sites.leetcode2.LC_00206_ReverseLinkedList.ListNode;
import org.junit.jupiter.api.Test;

class LC_00206_ReverseLinkedListTest {

    private LC_00206_ReverseLinkedList lc = new LC_00206_ReverseLinkedList();

    @Test
    void solutionTest1() {
        ListNode node1 = new ListNode(2);
        ListNode head = new ListNode(1, node1);

        ListNode listNode = lc.reverseList(head);

        assertThat(listNode.val).isEqualTo(2);
        assertThat(listNode.next.val).isEqualTo(1);
    }
    @Test
    void solutionTest2() {
        ListNode listNode = lc.reverseList(null);

        assertThat(listNode).isNull();
    }

}
