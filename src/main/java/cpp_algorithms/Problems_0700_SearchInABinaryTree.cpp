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
	TreeNode* searchBST(TreeNode* root, int val) {
		TreeNode** returnNode = 0;

		recursiveSearch(returnNode, root, val);

		return *returnNode;
	}

private:
	void recursiveSearch(TreeNode** returnNode, TreeNode* node, int val) {
		if (node != 0) {
			//cout << " >> " << node->val << endl;
			if (node->val == val) {
				*returnNode = node;
			}
			else {
				recursiveSearch(returnNode, node->left, val);
				recursiveSearch(returnNode, node->right, val);
			}
		}
	}
};

