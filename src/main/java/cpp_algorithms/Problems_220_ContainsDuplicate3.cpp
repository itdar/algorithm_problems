#include <vector>

using namespace std;

class Solution {
public:
	bool containsNearbyAlmostDuplicate(vector<int>& nums, int k, int t) {
		bool answer = false;

		for (int i = 0; i < nums.size(); ++i)
		{
			for (int j = i + 1; j < nums.size() && j <= i + k; ++j)
			{
				if (abs((long)nums[i] - (long)nums[j]) <= t)
				{
					return true;
				}
				// int64_t temp = (long)nums[i] - (long)nums[j];
				// if (temp < 0)
				// {
				//     temp = (-temp);
				// }
				// if (temp <= t)
				// {
				//     cout << temp << endl;
				//     return true;
				// }
			}
		}
		return answer;
	}
};