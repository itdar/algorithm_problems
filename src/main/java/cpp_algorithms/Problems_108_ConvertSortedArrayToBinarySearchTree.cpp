#include <vector>

using namespace std;

// Definition for a binary tree node.
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

 // Process
 //1. Input numVector
 //2. Make root resultNode using nums center
 //3. Iterate from begin to numsCenter
 // 3.1. Make tree to left node of resultNode
 //4. Iterate from numsCenter + 1 to the end
 // 4.1. Make tree to right node of resultNode
 //5. Return resultNode

class Solution {
public:
	TreeNode* sortedArrayToBST(vector<int>& nums) {
		TreeNode* resultTree;
		resultTree->val = nums.at(nums.size() / 2);

		for (int i = 0; i < nums.size() / 2; ++i) {
			TreeNode* tempNode = new TreeNode(nums[i]);
		}

		for (int i = nums.size() / 2 + 1; i < nums.size(); ++i) {

		}
	}
private:
	TreeNode* recursiveMakeNode(TreeNode* node) {

	}
};