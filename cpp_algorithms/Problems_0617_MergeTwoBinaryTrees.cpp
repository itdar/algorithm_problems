#include <iostream>

using namespace std;

/**
 * Definition for a binary tree node.
 */
 struct TreeNode {
     int val;
     TreeNode *left;
     TreeNode *right;
     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 };
 

 // Process
 //1. Input two tree rootNode
 //2. Prepare return rootNode
 //3. *12, Call recursive mergeSum
 //4. Return resultRootNode

 //recursiveMergeSum()
 //1. Input two treeNode
 //2. Check if one of them is not null at least
 // 2.1. If so -> add or put them to resultTreeNode
 //3. Move to next level node (left)
 //4. Move to next level node (right)
 //5. Finish

class Solution {
public:
	TreeNode* mergeTrees(TreeNode* t1, TreeNode* t2) {
		TreeNode* resultRootNode;

		recursiveMergeSum(&resultRootNode, t1, t2);

		return resultRootNode;
	}
private:
	void recursiveMergeSum(TreeNode** resultTree, TreeNode* node1, TreeNode* node2) {
		if (node1 != 0 && node2 != 0) {
			*resultTree = new TreeNode(node1->val + node2->val);
			recursiveMergeSum(&((*resultTree)->left), node1->left, node2->left);
			recursiveMergeSum(&((*resultTree)->right), node1->right, node2->right);
		}
		else if (node1 != 0 && node2 == 0) {
			*resultTree = new TreeNode(node1->val);
			recursiveMergeSum(&((*resultTree)->left), node1->left, 0);
			recursiveMergeSum(&((*resultTree)->right), node1->right, 0);
		}
		else if (node1 == 0 && node2 != 0) {
			*resultTree = new TreeNode(node2->val);
			recursiveMergeSum(&((*resultTree)->left), 0, node2->left);
			recursiveMergeSum(&((*resultTree)->right), 0, node2->right);
		}
		else { // both are NULL
			*resultTree = 0;
		}
	}
};