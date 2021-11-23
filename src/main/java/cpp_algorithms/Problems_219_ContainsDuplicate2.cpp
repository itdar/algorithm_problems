#include <vector>
#include <stdio.h>
#include <iostream>

using namespace std;

class Solution {
public:
	bool containsNearbyDuplicate(vector<int>& nums, int k) {
		bool answer = false;

		for (int i = 0; i < nums.size(); ++i)
		{
			for (int j = i + 1; j <= i + k && j < nums.size(); ++j)
			{
				if (nums[i] == nums[j])
					return true;
			}
		}
		return answer;
	}
};


//int main(int argc, char *argv[]) {
//
//	//cout << "Hello world" << endl;
//
//	std::vector<int> tempVector = { 1, 2, 3, 1, 5 };
//	//std::vector<int> tempVector = { 0 };
//
//	Solution sln;
//
//	bool answer = sln.containsNearbyDuplicate(tempVector, 2);
//
//	cout << answer << endl;
//
//}