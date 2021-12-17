package algorithm_sites.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class LeetCode_0938_RangeSumOfBST {
    private List<Integer> list = new ArrayList<>();
    private int count = 0;
    private int low;
    private int high;

    public int rangeSumBST(TreeNode938 root, int low, int high) {
        this.low = low;
        this.high = high;

        iterateNodes(root);

        return count;
    }

    private void iterateNodes(TreeNode938 node) {
        if (Objects.isNull(node)) {
            return;
        }

        if (low <= node.val && node.val <= high) {
            count += node.val;
        }

        iterateNodes(node.left);
        iterateNodes(node.right);
    }

}

class TreeNode938 {
    int val;
    TreeNode938 left;
    TreeNode938 right;
    TreeNode938() {}
    TreeNode938(int val) { this.val = val; }
    TreeNode938(int val, TreeNode938 left, TreeNode938 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}