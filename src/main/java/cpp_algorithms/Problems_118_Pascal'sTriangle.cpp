#include <vector>
#include <iostream>

using namespace std;

// Process
//1. Input numRows
//2. Iterate from 1 to numRows
// 2.1. Make vector using iter index
// 2.2. Fill the vector
// 2.3. Put the vector to resultVector
//3. Return resultVector

class Solution {
public:
	vector<vector<int>> generate(int numRows) {
		vector<vector<int>> resultVector;
		if (numRows > 0) {
			vector<int> tempFirst = { 1 };
			resultVector.push_back(tempFirst);
			for (int i = 1; i < numRows; ++i) {
				vector<int> tempVector;
				tempVector.push_back(1);
				for (int j = 0; j < i-1; ++j) {
					int sum = resultVector.at(i - 1).at(j) + resultVector.at(i - 1).at(j + 1);
					tempVector.push_back(sum);
				}
				tempVector.push_back(1);
				resultVector.push_back(tempVector);
			}
		}
		return resultVector;
	}
};

//int main(int argc, char *argv[]) {
//
//	Solution sln;
//	
//	vector<vector<int>> result = sln.generate(3);
//
//	for (int i = 0; i < result.size(); ++i) {
//		for (int j = 0; j < result.at(i).size(); ++j) {
//			cout << result.at(i).at(j);
//		}
//		cout << endl;
//	}
//
//}