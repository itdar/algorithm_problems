#include <vector>
#include <algorithm>
#include <numeric>

using namespace std;

class Solution {
public:
	int maxSubArray(vector<int>& nums) {
		int largestSum = INT_MIN;

		int length = nums.size();
		for (int i = length; i >= 1; --i) {
			for (int j = 0; j + i - 1 < length; ++j) {
				int sum = accumulate(nums.begin() + j, nums.begin() + j + i, 0);
				largestSum = max(sum, largestSum);
			}
		}
		return largestSum;
	}
};