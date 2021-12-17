package algorithm_sites.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class LeetCode_0938_RangeSumOfBST {
    private List<Integer> list = new ArrayList<>();

    public int rangeSumBST(TreeNode938 root, int low, int high) {

        iterateNodes(root);

        Collections.sort(list);

        int sum = 0;
        for (Integer integer : list) {
            if (low <= integer && integer <= high) {
                sum += integer;
            }
        }

        return sum;
    }

    private void iterateNodes(TreeNode938 node) {
        if (Objects.isNull(node)) {
            return;
        }

        list.add(node.val);
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