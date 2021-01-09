#include <vector>

class Solution {
public:
	int searchInsert(std::vector<int>& nums, int target) {
		//Process
		//1. Input nums and targetNumber
		//2. Iterate from begin to the end
		// 2.1. Check if it's same with targetNumber or bigger
		//  2.1.1. If so -> it's answerIndex
		//3. Return answerIndex
		int answerIndex = 0;
		int i = 0;
		while (answerIndex == 0 && i < nums.size())
		{
			if (nums[i] >= target)
			{
				return i;
			}
			++i;
		}
		if (i >= nums.size())
		{
			answerIndex = nums.size();
		}
		return answerIndex;
	}
};