#include <iostream>

using namespace std;

//Definition for a binary tree node.
struct TreeNode {
	int val;
	TreeNode *left;
	TreeNode *right;
	TreeNode(int x) : val(x), left(0), right(0) {}
};


// Process
//1. Input two root nodes
//2. Iterate all ( *, 1, 2 - front )
// 2.1. Fill the vector
//3. Compare two vector
//4. Return result

class Solution {
public:
	bool isSameTree(TreeNode* p, TreeNode* q) {
		return isSameTreeRecursive(p, q);
	}
private:
	bool isSameTreeRecursive(TreeNode* p, TreeNode* q) {
		if (p != 0 && q != 0)
			if (p->val == q->val && isSameTreeRecursive(p->left, q->left) && isSameTreeRecursive(p->right, q->right))
			{
				return true;
			}
			else {}
		else {
			if (p == 0 && q == 0)
				return true;
		}
		return false;
	}
};

//int main(int argc, char *argv[]) {
//
//	Solution sln;
//
//	cout << sln.isSameTree(NULL, NULL) << endl;
//
//}