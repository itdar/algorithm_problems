#include <vector>

using namespace std;

class Solution {
public:
	int missingNumber(vector<int>& nums) {
		vector<int> dynamicVec;
		for (int i = 0; i <= nums.size(); ++i) {
			dynamicVec.push_back(0);
		}
		for (int i = 0; i < nums.size(); ++i)
			++dynamicVec[nums[i]];

		for (int i = 0; i < dynamicVec.size(); ++i)
			if (dynamicVec[i] == 0)
				return i;
		return 0;
	}
};