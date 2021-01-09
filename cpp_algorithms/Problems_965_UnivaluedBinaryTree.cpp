#include <iostream>

using namespace std;

//Definition for a binary tree node.
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

// Process
//1. Input node
//2. Check if node is null or not
// 2.1. If not -> Check if node value and left node value are the same or not
//  2.1.1. If so -> Call recursive putting left node
// 2.2. Check if node value and right node value are the same or not
//  2.2.1. If so -> Call recursive putting right node
//3. Return answer

class Solution {
public:
	bool isUnivalTree(TreeNode* root) {
		// * 1 2
		bool answer = true;

		if (root != 0) {
			if (root->left != 0 && root->val != root->left->val) {
				return false;
			}
			else {
				answer = isUnivalTree(root->left);
			}
			if (answer) {
				if (root->right != 0 && root->val != root->right->val) {
					return false;
				}
				else {
					answer = isUnivalTree(root->right);
				}
			}
		}

		return answer;
	}
};