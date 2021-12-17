package algorithm_sites.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class LeetCode_0938_RangeSumOfBSTTest {

    @Test
    public void rangeSumBST_Test_1() {
        LeetCode_0938_RangeSumOfBST test = new LeetCode_0938_RangeSumOfBST();

        TreeNode938 root = new TreeNode938(10);
        TreeNode938 leaf1 = new TreeNode938(3);
        TreeNode938 leaf2 = new TreeNode938(7);
        TreeNode938 leaf3 = new TreeNode938(18);
        TreeNode938 leaf4 = new TreeNode938(5);
        TreeNode938 leaf5 = new TreeNode938(15);

        leaf4.left = leaf1;
        leaf4.right = leaf2;
        leaf5.right = leaf3;
        root.left = leaf4;
        root.right = leaf5;

        assertThat(test.rangeSumBST(root, 7, 15)).isEqualTo(32);
    }

    @Test
    public void rangeSumBST_Test_2() {
        LeetCode_0938_RangeSumOfBST test = new LeetCode_0938_RangeSumOfBST();

        TreeNode938 root = new TreeNode938(10);
        TreeNode938 leaf1 = new TreeNode938(1);
        TreeNode938 leaf2 = new TreeNode938(6);
        TreeNode938 leaf3 = new TreeNode938(3);
        TreeNode938 leaf4 = new TreeNode938(7);
        TreeNode938 leaf5 = new TreeNode938(13);
        TreeNode938 leaf6 = new TreeNode938(18);
        TreeNode938 leaf7 = new TreeNode938(5);
        TreeNode938 leaf8 = new TreeNode938(15);

        leaf3.left = leaf1;
        leaf4.left = leaf2;
        leaf7.left = leaf3;
        leaf7.right = leaf4;
        leaf8.left = leaf5;
        leaf8.right = leaf6;
        root.left = leaf7;
        root.right = leaf8;

        assertThat(test.rangeSumBST(root, 6, 10)).isEqualTo(23);
    }
}
