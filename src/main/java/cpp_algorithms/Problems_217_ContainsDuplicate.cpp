#include <vector>
#include <stdio.h>
#include <iostream>
#include <algorithm>

using namespace std;

class Solution {
public:
	bool containsDuplicate(vector<int>& nums) {
		bool answer = false;

		if (nums.size() > 0) {
			sort(nums.begin(), nums.end());

			for (int i = 0; i < nums.size() - 1; ++i)
			{
				if (nums[i] == nums[i + 1])
				{
					return true;
				}
			}
		}

		return answer;
	}

};


//int main(int argc, char *argv[]) {
//
//	cout << "Hello world" << endl;
//
//	//std::vector<int> tempVector = { 1, 2, 3, 1, 5 };
//	std::vector<int> tempVector = { 0 };
//
//	Solution sln;
//	
//	bool answer = sln.containsDuplicate(tempVector);
//
//	cout << answer << endl;
//
//}