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

class Solution {
private:
	void diggingTree(Node* node, int* maxDepth, int depth) {
		if (*maxDepth < ++depth)
			*maxDepth = depth;
		for (int i = 0; i < node->children.size(); ++i)
		{
			diggingTree(node->children.at(i), maxDepth, depth);
		}
	}
public:
	int maxDepth(Node* root) {
		int maxDepth = 0;
		int depth = 0;

		if (root != 0)
			diggingTree(root, &maxDepth, depth);

		return maxDepth;
	}
};

