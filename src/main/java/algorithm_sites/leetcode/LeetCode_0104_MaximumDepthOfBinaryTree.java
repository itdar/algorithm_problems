package algorithm_sites.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class LeetCode_0104_MaximumDepthOfBinaryTree {

    List<Integer> depths = new ArrayList<>();

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int depth = 1;

        recursive(depth, root);

        return Collections.max(depths);
    }

    public void recursive(int depth, TreeNode node) {
        depths.add(depth);

        if (node.left != null) {
            recursive(depth+1, node.left);
        }

        if (node.right != null) {
            recursive(depth+1, node.right);
        }
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) { this.val = val; }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}