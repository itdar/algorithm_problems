#include <vector>
#include <iostream>

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

// Process
//1. Input root node
//2. Call recursive function
//3. Return resultVector

// recursiveFunction
//1. Input node, resultVector, level
//2. Add level
//3. Check if resultVector has that level vector
// 3.1. If not -> make new vector and pushBack
// 3.2. If so -> add node val
//4. Iterate children of node from begin to the end
// 4.1. Call recursive
//5. Subtract level
class Solution {
public:
	vector<vector<int>> levelOrder(Node* root) {
		vector<vector<int>> resultVector;
		int level = 0;
		
		if (root != 0)
			recursiveLevelOrderTraversal(root, &resultVector, &level);

		return resultVector;
	}
private:
	void recursiveLevelOrderTraversal(Node* node, vector<vector<int>>* resultVector, int* level) {
		++*level;

		if (resultVector->size() < *level)
		{
			vector<int> *newVector = new vector<int>();
			newVector->push_back(node->val);
			resultVector->push_back(*newVector);
		}
		else
		{
			resultVector->at(*level - 1).push_back(node->val);
		}

		for (int i = 0; i < node->children.size(); ++i)
		{
			recursiveLevelOrderTraversal(node->children.at(i), resultVector, level);
		}
		
		--*level;
	}
};


//int main(int argc, char *argv[]) {
//
//
//
//}