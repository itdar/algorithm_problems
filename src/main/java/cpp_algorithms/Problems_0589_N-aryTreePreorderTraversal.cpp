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


//preorder means 전위수식 *12 

// Process
//1. Input root node pointer
//2. Make returnVector
//3. Put val in the returnVector
//4. Iterate from begin to the end of children (*Node)
// 4.1. Call recursivePreorder method
//5. Return returnVector

// recursivePreorder
//1. Input returnVector
//2. Put val in the returnVector
//3. Iterate from begin to the end (*Node)
// 3.1. Call recursiveVector


class Solution {
public:
	vector<int> preorder(Node* root) {
		vector<int> returnVector;

		if (root != 0) {
			returnVector.push_back(root->val);
			for (int i = 0; i < root->children.size(); ++i) {
				recursivePreorder(root->children[i], returnVector);
			}
		}

		return returnVector;
	}

private:
	void recursivePreorder(Node* node, vector<int>& returnVector) {
		returnVector.push_back(node->val);
		for (int i = 0; i < node->children.size(); ++i) {
			recursivePreorder(node->children[i], returnVector);
		}
	}
};