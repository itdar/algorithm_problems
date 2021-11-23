#include <vector>

using namespace std;


// Process
//1. input num vector
//2. Iterate from begin to the end - zeroCount
// 2.1. Check if it's 0
//  2.1.1. If so -> erase and push to back
//3. Return vector

class Solution {
public:
	void moveZeroes(vector<int>& nums) {

		int count = 0;
		for (int i = 0; i < nums.size(); ++i)
		{
			if (nums[i] == 0)
			{
				++count;
				nums.erase(nums.begin() + i);
				--i;
			}
		}

		for (int i = 0; i < count; ++i)
		{
			nums.push_back(0);
		}

		//int zeroCount = 0;
		//for (int i = 0; i < nums.size() - zeroCount; ++i)
		//{
		//	if (nums[i] == 0)
		//	{
		//		nums.erase(nums.begin() + i);
		//		nums.push_back(0);
		//		++zeroCount;
		//		--i;
		//	}
		//}
	}
};