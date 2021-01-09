#include <vector>

using namespace std;


//Definition for a binary tree node.
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(0), right(0) {}
};


// Process
//1. Input root node pointer
//2. Make depthCount vector
//3. Make depthSum vector
//4. Dig into tree (recursive)
//5. Return depthAverage vector

// digTree
//1. Input node, depthCount vector, depthSum vector, depth
//2. 

class Solution {
private:
	void digTree(TreeNode* node, vector<double>& depthCount, vector<double>& depthSum, int& depth) {
		int depthHere = depth++;

		if (depthCount.size() < depthHere + 1)
		{
			depthCount.push_back(1);
			depthSum.push_back(node->val);
		}
		else
		{
			++depthCount[depthHere];
			depthSum[depthHere] += node->val;
		}

		if (node->left != 0)
			digTree(node->left, depthCount, depthSum, depth);
		if (node->right != 0)
			digTree(node->right, depthCount, depthSum, depth);

		depth = depthHere;
	}
public:
	vector<double> averageOfLevels(TreeNode* root) {
		vector<double> depthAverage;

		vector<double> depthCount;
		vector<double> depthSum;
		int depth = 0;

		digTree(root, depthCount, depthSum, depth);

		for (int i = 0; i < depthCount.size(); ++i)
		{
			depthAverage.push_back(depthSum[i] / depthCount[i]);
		}

		return depthAverage;
	}
};
