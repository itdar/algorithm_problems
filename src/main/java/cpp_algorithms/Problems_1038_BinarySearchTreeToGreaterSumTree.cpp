#include <vector>
#include <iostream>

using namespace std;

// Process
//1. Input root node
//2. Iterate 2-val-1 order in tree structure
// 2.1. Make list of val
//3. Make greaterSum list
//4. Correct tree using value list
//5. Return root node


// Definition for a binary tree node.
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
public:
	TreeNode* bstToGst(TreeNode* root) {
		vector<int> valList;
		int index = 0;
		//2.
		recursiveValueListMaker(valList, root);
		
		//3.
		for (int i = 1; i < valList.size(); ++i) {
			valList[i] += valList[i - 1];
		}

		//4.
		recursiveTreeChanger(valList, root, index);

		return root;
	}

private:
	void recursiveValueListMaker(vector<int>& valList, TreeNode* node) {
		if (node->right != 0)
			recursiveValueListMaker(valList, node->right);
		valList.push_back(node->val);
		if (node->left != 0)
			recursiveValueListMaker(valList, node->left);
	}

	void recursiveTreeChanger(vector<int>& valList, TreeNode* node, int& index) {
		if (node->right != 0)
			recursiveTreeChanger(valList, node->right, index);
		node->val = valList[index++];
		if (node->left != 0)
			recursiveTreeChanger(valList, node->left, index);
	}
};