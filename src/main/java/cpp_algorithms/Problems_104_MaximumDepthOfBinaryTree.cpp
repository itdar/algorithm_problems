#include <iostream>

// Definition for a binary tree node.
 struct TreeNode {
     int val;
     TreeNode *left;
     TreeNode *right;
     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 };
 
class Solution {
public:
	int maxDepth(TreeNode* root) {
		int maxDepth = 0;
		int depth = 1;
		checkDepth(root, &maxDepth, &depth);

		return maxDepth;
	}
private:
	void checkDepth(TreeNode* node, int *maxDepth, int *depth) {
		if (node != 0) {
			++*depth;
			if (*depth > *maxDepth)
				*maxDepth = *depth;
			if (node->left != 0)
				checkDepth(node->left, maxDepth, depth);
			if (node->right != 0)
				checkDepth(node->right, maxDepth, depth);
			--*depth;
		}
	}
};