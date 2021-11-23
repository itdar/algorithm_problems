#include <vector>

using namespace std;

// Process
//1. Input


//Definition for a binary tree node.
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
public:
	bool leafSimilar(TreeNode* root1, TreeNode* root2) {
		bool answer = true;

		vector<int> leafSeq1;
		vector<int> leafSeq2;

		recursiveMakeLeaf(leafSeq1, root1);
		recursiveMakeLeaf(leafSeq2, root2);

		int length = 0;
		if (leafSeq1.size() > leafSeq2.size())
			length = leafSeq2.size();
		else
			length = leafSeq1.size();

		for (int i = 0; answer && i < length; ++i) {
			if (leafSeq1[i] != leafSeq2[i])
				answer = false;
		}

		return answer;
	}
private:
	void recursiveMakeLeaf(vector<int>& leafSeq, TreeNode* node) {
		if (node != 0) 
			if (node->left == 0 && node->right == 0) {
				leafSeq.push_back(node->val);
			} else {
				recursiveMakeLeaf(leafSeq, node->left);
				recursiveMakeLeaf(leafSeq, node->right);
			}
	}
};