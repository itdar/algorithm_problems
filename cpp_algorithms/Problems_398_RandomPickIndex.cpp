#include <vector>


using namespace std;


class Solution {
private:
	vector<int> nums;
	vector<int> indexes;

	void getTargetIndex(int target) {
		for (int i = 0; i < nums.size(); ++i)
		{
			if (nums[i] == target)
			{
				indexes.push_back(i);
			}
		}
	}

public:
	Solution(vector<int> _nums) {
		nums = _nums;
	}

	int pick(int target) {

		getTargetIndex(target);

		return indexes[rand() % indexes.size()];
	}
};

/**
* Your Solution object will be instantiated and called as such:
* Solution obj = new Solution(nums);
* int param_1 = obj.pick(target);
*/