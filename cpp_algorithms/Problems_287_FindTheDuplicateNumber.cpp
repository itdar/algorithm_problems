#include <vector>

using namespace std;

class Solution {
public:
	int findDuplicate(vector<int>& nums) {
		bool isDone = false;
		int result;

		vector<int> dynamic;
		for (int i = 0; i < nums.size(); ++i)
			dynamic.push_back(0);
		for (int i = 0; i < nums.size(); ++i)
			++dynamic[nums[i] - 1];
		for (int i = 0; !isDone && i < dynamic.size(); ++i)
			if (dynamic[i] > 1) {
				result = i + 1;
				isDone = true;
			}
		return result;
	}
};