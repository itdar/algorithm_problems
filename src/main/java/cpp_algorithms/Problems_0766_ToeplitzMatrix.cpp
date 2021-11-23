#include <vector>
#include <iostream>

using namespace std;

// Process
//1. Input 2d matrix
//2. Iterate from begin to the width (i)
// 2.1. Iterate from begin to the height (j)
//  2.1.1. Check if [i][j] == [j][i+j]
//   2.1.1.1. If not -> false
//3. Iterate from 1 to the height (i)
// 3.1. Iterate from 1 to the height (j)
//  3.1.1. Check if [i][0] == [i][j-1]
//   3.1.1.1. If not -> false
//4. Return answer

class Solution {
public:
	bool isToeplitzMatrix(vector<vector<int>>& matrix) {
		bool answer = true;

		if (matrix[0].size() > 0) {
			for (int i = 0; i < matrix[0].size(); ++i) {
				for (int j = 0; j < matrix.size(); ++j) {
					if (j + i < matrix[0].size())
						if (matrix[0][i] != matrix[j][j+i]) {
							answer = false;
						}
				}
			}
			if (answer) {
				for (int i = 1; i < matrix.size() - 1; ++i) {
					for (int j = 0; j < matrix[i].size(); ++j) {
						if (j + i < matrix.size())
							if (matrix[i][0] != matrix[i + j][j]) {
								answer = false;
							}
					}
				}
			}
		}
		return answer;
	}
};

//int main(int argc, char* argv[]) {
//	vector<int> temp1 = { 1,2,3,4 };
//	vector<int> temp2 = { 5,1,2,3 };
//	vector<int> temp3 = { 9,5,1,2 };
//	//vector<int> temp1 = { 83 };
//	//vector<int> temp2 = { 64 };
//	//vector<int> temp3 = { 57 };
//	vector<vector<int>> tempVec;
//	tempVec.push_back(temp1);
//	tempVec.push_back(temp2);
//	tempVec.push_back(temp3);
//
//	Solution sln;
//	cout << sln.isToeplitzMatrix(tempVec) << endl;
//}