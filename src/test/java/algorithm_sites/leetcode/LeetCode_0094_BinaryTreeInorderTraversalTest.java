package algorithm_sites.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class LeetCode_0094_BinaryTreeInorderTraversalTest {

    @Test
    public void inorderTraversalTest_1() {
        LeetCode_0094_BinaryTreeInorderTraversal test = new LeetCode_0094_BinaryTreeInorderTraversal();

        TreeNode94 root = new TreeNode94(1);
        TreeNode94 node2 = new TreeNode94(2);
        TreeNode94 node3 = new TreeNode94(3);

        root.right = node2;
        node2.left = node3;

        assertThat(test.inorderTraversal(root)).containsExactly(1,3,2);
    }

    @Test
    public void inorderTraversalTest_2() {
        LeetCode_0094_BinaryTreeInorderTraversal test = new LeetCode_0094_BinaryTreeInorderTraversal();

        TreeNode94 root = new TreeNode94();

        assertThat(test.inorderTraversal(root)).containsExactly(0);
    }

    @Test
    public void inorderTraversalTest_3() {
        LeetCode_0094_BinaryTreeInorderTraversal test = new LeetCode_0094_BinaryTreeInorderTraversal();

        TreeNode94 root = new TreeNode94(1);

        assertThat(test.inorderTraversal(root)).containsExactly(1);
    }

}
