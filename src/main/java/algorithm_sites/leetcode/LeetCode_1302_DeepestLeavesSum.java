package algorithm_sites.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_1302_DeepestLeavesSum {

    private int max = 0;
    private Map<Integer, Integer> map = new HashMap<>();

    public int deepestLeavesSum(TreeNode root) {
        recursiveDeepest(1, root);

        return map.get(max);
    }

    private void recursiveDeepest(int depth, TreeNode node) {
        if (max < depth) {
            max = depth;
        }

        if (node.left != null) {
            recursiveDeepest(depth+1, node.left);
        }

        map.put(depth, map.getOrDefault(depth, 0) + node.val);

        if (node.right != null) {
            recursiveDeepest(depth+1, node.right);
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

}