#include <vector>

using namespace std;

class Solution {
public:
	int singleNonDuplicate(vector<int>& nums) {
		int result = 0;

		if (nums.size() == 1)
		{
			result = nums[0];
		}
		else if (nums.size() == 0)
		{

		}
		else if (nums.size() == 2)
		{
			if (nums[0] != nums[1])
				result = nums[0];
		}
		else
		{
			if (nums[0] != nums[1])
			{
				result = nums[0];
			}
			else if (nums[nums.size() - 1] != nums[nums.size() - 2])
			{
				result = nums[nums.size() - 1];
			}
			else
			{
				for (int i = 1; i < nums.size() - 2; ++i)
				{
					if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1])
						result = nums[i];
				}
			}
		}

		return result;
	}
};