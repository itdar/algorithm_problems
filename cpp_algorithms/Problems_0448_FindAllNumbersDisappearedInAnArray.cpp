#include <vector>

using namespace std;

class Solution {
public:
	vector<int> findDisappearedNumbers(vector<int>& nums) {
		vector<int> resultVec;

		for (int i = 0; i < nums.size(); ++i) {
			resultVec.push_back(0);
		}

		for (int i = 0; i < nums.size(); ++i) {
			++resultVec[nums[i]-1];
		}

		for (int i = 0; i < resultVec.size(); ++i) {
			if (resultVec[i] != 0) {
				resultVec.erase(resultVec.begin()+(i--));
			}
		}

		return resultVec;
	}
};