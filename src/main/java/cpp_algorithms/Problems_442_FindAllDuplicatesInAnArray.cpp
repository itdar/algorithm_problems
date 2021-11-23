#include <vector>
#include <iostream>

using namespace std;

class Solution {
public:
	vector<int> findDuplicates(vector<int>& nums) {

		vector<int> resultVector;
		vector<int> mapVector;

		for (int i = 0; i < nums.size(); ++i) {
			mapVector.push_back(0);
		}

		for (int i = 0; i < nums.size(); ++i) {
			++mapVector[nums[i]-1];
		}

		for (int i = 0; i < mapVector.size(); ++i) {
			if (mapVector[i] > 1) {
				resultVector.push_back(i+1);
			}
		}

		return resultVector;
	}
};

//int main(int argc, char *argv[]) {
//
//	vector<int> testVector = { 4, 3, 2, 7, 8, 2, 3, 1 };
//
//	Solution sln;
//
//	vector<int> resultVector = sln.findDuplicates(testVector);
//
//	for (int i = 0; resultVector.size(); ++i)
//	{
//		cout << resultVector[i] << endl;
//	}
//
//}