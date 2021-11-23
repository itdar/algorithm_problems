
// Definition for a binary tree node.
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(0), right(0) {}
};
 
// Process
//1. Input two TreeNodes
//2. Do if first nodes have same value
//3. Recursive compare nodes
//4. Return result

// bool RecursiveNodeCompare(node1, node2)
//1. Input TreeNodes
//2. If nodes have same val
// 2.1. Check node1's left node val is same with node2's left or right val
//  2.1.1. If same with node2's left val -> RecursiveNodeCompare(left1, left2)
//  2.1.2. If same with node2's right val -> RecursiveNodeCompare(left1, right2)
// 2.2. Check node1's right node val is same with node2's left or right val
//  2.2.1. If same with node2's left val -> RecursiveNodeCompare(right1, left2)
//  2.2.2. If same with node2's right val -> RecursiveNodeCompare(right1, right2)
//3. Return result

class Solution {
public:
	bool flipEquiv(TreeNode* root1, TreeNode* root2) {
		bool result = false;
		if (root1 != 0 && root2 != 0) {
			if (root1->val == root2->val) {
				result = RecursiveNodeCompare(root1, root2);
			}
		}
		else if (root1 == 0 && root2 == 0) {
			result = true;
		}
		return result;
	}

	bool RecursiveNodeCompare(TreeNode* node1, TreeNode* node2) {
		bool result = false;

		if (node1->left != 0 && node2->left != 0 && node1->right != 0 && node2->right != 0) {
			if (node1->left->val == node2->left->val) {
				if (RecursiveNodeCompare(node1->left, node2->left)) {
					if (node1->right->val == node2->right->val) {
						if (RecursiveNodeCompare(node1->right, node2->right)) {
							result = true;
						}
					}
				}
			}
			if (node1->left->val == node2->right->val) {
				if (RecursiveNodeCompare(node1->left, node2->right)) {
					if (node1->right->val == node2->left->val) {
						if (RecursiveNodeCompare(node1->right, node2->left)) {
							result = true;
						}
					}
				}
			}
		}
		else if (node1->left == 0 && node2->left == 0 && node1->right != 0 && node2->right != 0) {
			if (node1->right->val == node2->right->val) {
				if (RecursiveNodeCompare(node1->right, node2->right)) {
					result = true;
				}
			}
		}
		else if (node1->right == 0 && node2->right == 0 && node1->left != 0 && node2->left != 0) {
			if (node1->left->val == node2->left->val) {
				if (RecursiveNodeCompare(node1->left, node2->left)) {
					result = true;
				}
			}
		}
		else if (node1->left == 0 && node2->right == 0 && node1->right != 0 && node2->left != 0) {
			if (node1->right->val == node2->left->val) {
				if (RecursiveNodeCompare(node1->right, node2->left)) {
					result = true;
				}
			}
		}
		else if (node1->right == 0 && node2->left == 0 && node1->left != 0 && node2->right != 0) {
			if (node1->left->val == node2->right->val) {
				if (RecursiveNodeCompare(node1->left, node2->right)) {
					result = true;
				}
			}
		}
		else if (node1->right == 0 && node2->left == 0 && node1->left == 0 && node2->right == 0) {
			result = true;
		}

		return result;
	}
};