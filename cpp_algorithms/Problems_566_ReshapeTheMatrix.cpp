#include <vector>

using namespace std;

class Solution {
public:
	vector<vector<int>> matrixReshape(vector<vector<int>>& nums, int r, int c) {
		vector<vector<int>> reshapedMatrix(r, vector<int>(0));

		vector<int> tempVector;
		if (nums.size() * nums[0].size() == r * c)
		{
			for (int i = 0; i < nums.size(); ++i)
				for (int j = 0; j < nums[i].size(); ++j)
				{
					tempVector.push_back(nums[i][j]);
				}

			int index = 0;
			for (int i = 0; i < r; ++i)
			{
				for (int j = 0; j < c; ++j)
				{
					reshapedMatrix[i].push_back(tempVector[index]);
					++index;
				}
			}
		}
		else
		{
			reshapedMatrix = nums;
		}
		return reshapedMatrix;
	}
};

