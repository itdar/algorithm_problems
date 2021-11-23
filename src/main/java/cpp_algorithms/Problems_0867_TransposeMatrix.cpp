#include <vector>

using namespace std;

// Process
//1. Input 2d vector A
//2. Iterate first element size
// 2.1. Make vector
// 2.2. Iterate A size
//  2.2.1. Fill in vector
// 2.3. Add to resultVector
//3. Return resultVector

class Solution {
public:
	vector<vector<int>> transpose(vector<vector<int>>& A) {
		vector<vector<int>> resultVector;
		for (int i = 0; i < A[0].size(); ++i) {
			vector<int> tempVec;
			for (int j = 0; j < A.size(); ++j) {
				tempVec.push_back(A[j][i]);
			}
			resultVector.push_back(tempVec);
		}
		return resultVector;
	}
};