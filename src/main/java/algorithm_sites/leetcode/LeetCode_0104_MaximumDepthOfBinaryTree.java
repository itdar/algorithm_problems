package algorithm_sites.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode_0104_MaximumDepthOfBinaryTree {

    List<Integer> depths = new ArrayList<>();

    public int maxDepth(TreeNode104 root) {
        if (root == null) {
            return 0;
        }

        int depth = 1;

        recursive(depth, root);

        return Collections.max(depths);
    }

    public void recursive(int depth, TreeNode104 node) {
        depths.add(depth);

        if (node.left != null) {
            recursive(depth+1, node.left);
        }

        if (node.right != null) {
            recursive(depth+1, node.right);
        }
    }

}

class TreeNode104 {
    int val;
    TreeNode104 left;
    TreeNode104 right;

    TreeNode104() {}

    TreeNode104(int val) { this.val = val; }

    TreeNode104(int val, TreeNode104 left, TreeNode104 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}