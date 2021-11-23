#include <vector>
#include <iostream>

using namespace std;


 // Definition for a binary tree node.
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
public:
	TreeNode* invertTree(TreeNode* root) {
		TreeNode* resultRoot = 0;

		if (root != 0) {
			resultRoot = new TreeNode(root->val);

			recursiveInvertTree(root, resultRoot);
		}
		return resultRoot;
	}
private:
	void recursiveInvertTree(TreeNode* originNode, TreeNode* resultNode) {
		if (originNode->left != 0) {
			resultNode->right = new TreeNode(originNode->left->val);
			recursiveInvertTree(originNode->left, resultNode->right);
		}

		if (originNode->right != 0) {
			resultNode->left = new TreeNode(originNode->right->val);
			recursiveInvertTree(originNode->right, resultNode->left);
		}
	}
};