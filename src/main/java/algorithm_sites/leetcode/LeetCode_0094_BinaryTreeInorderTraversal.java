package algorithm_sites.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_0094_BinaryTreeInorderTraversal {

    private List<Integer> result = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode94 root) {
        if (root == null) {
            return result;
        }

        recursiveInorderTraversal(root);

        return result;
    }

    private void recursiveInorderTraversal(TreeNode94 node) {
        if (node.left != null) {
            recursiveInorderTraversal(node.left);
        }

        result.add(node.val);

        if (node.right != null) {
            recursiveInorderTraversal(node.right);
        }
    }

}

class TreeNode94 {
    int val;
    TreeNode94 left;
    TreeNode94 right;
    TreeNode94() {}
    TreeNode94(int val) { this.val = val; }
    TreeNode94(int val, TreeNode94 left, TreeNode94 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}