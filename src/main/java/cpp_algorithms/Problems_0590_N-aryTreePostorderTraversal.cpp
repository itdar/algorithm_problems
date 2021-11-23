#include <vector>

using namespace std;

// Definition for a Node.
class Node {
public:
	int val;
	vector<Node*> children;

	Node() {}

	Node(int _val, vector<Node*> _children) {
		val = _val;
		children = _children;
	}
};


//postorder means 후위수식 12* 

// Process
//1. Input root node pointer
//2. Make returnVector
//3. Iterate from begin to the end of children (*Node)
// 3.1. Call recursivePreorder method
//4. Put val in the returnVector
//5. Return returnVector

// recursivePostorder
//1. Input returnVector
//2. Iterate from begin to the end (*Node)
// 2.1. Call recursiveVector
//3. Put val in the returnVector


class Solution {
public:
	vector<int> postorder(Node* root) {
		vector<int> returnVector;

		if (root != 0) {
			for (int i = 0; i < root->children.size(); ++i) {
				recursivePostorder(root->children[i], returnVector);
			}
			returnVector.push_back(root->val);
		}

		return returnVector;
	}

private:
	void recursivePostorder(Node* node, vector<int>& returnVector) {
		for (int i = 0; i < node->children.size(); ++i) {
			recursivePostorder(node->children[i], returnVector);
		}
		returnVector.push_back(node->val);
	}
};