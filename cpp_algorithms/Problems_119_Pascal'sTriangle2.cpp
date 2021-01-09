#include <vector>
#include <iostream>

using namespace std;

class Solution {
public:
	vector<int> getRow(int rowIndex) {
		vector<int> resultVector;
		if (rowIndex == 0) {
			resultVector.push_back(1);
			return resultVector;
		}
		for (int i = 0; i <= rowIndex; ++i) {
			vector<int> tempVector;
			for (int j = 0; j < i; ++j) {
				if (j == 0) {
					tempVector.push_back(1);
				}
				else {
					tempVector.push_back(resultVector.at(j - 1) + resultVector.at(j));
				}
				if (j == i - 1) {
					tempVector.push_back(1);
				}
			}
			resultVector = tempVector;
		}

		return resultVector;
	}
};

//int main(int argc, char *argv[]) {
//
//	Solution sln;
//
//	vector<int> result = sln.getRow(3);
//
//	for (int i = 0; i < result.size(); ++i) {
//		cout << result.at(i) << endl;
//	}
//
//}