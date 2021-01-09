#include <vector>
#include <iostream>

using namespace std;

// Process
//1. Input skyline grid
//2. Iterate from begin to the end (i)
// 2.1. Iterate from begin to the end (j)
//  2.1.1. Check [i][j] and [j][i] maxVal
// 2.2. Put maxVal to topBottom and leftRight view
//3. Iterate from begin to the end (i)
// 3.1. Iterate from begin to the end (j)
//  3.1.1. Check if grid[i][j] is smaller than (Small one of topBottom[j] and leftRight[i])
//   3.1.1.1. If so -> add diff between smallOne and grid[i][j] to maxIncreaseSum
//4. Return maxIncreaseSum

class Solution {
public:
	int maxIncreaseKeepingSkyline(vector<vector<int>>& grid) {
		int maxIncreaseSum = 0;

		if (grid.size() > 0) {
			vector<int> topBottom;
			vector<int> leftRight;
			int maxTB;
			int maxLR;
			for (int i = 0; i < grid.size(); ++i) {
				maxTB = 0;
				maxLR = 0;
				for (int j = 0; j < grid[i].size(); ++j) {
					if (grid[j][i] > maxTB)
						maxTB = grid[j][i];
					if (grid[i][j] > maxLR)
						maxLR = grid[i][j];
				}
				topBottom.push_back(maxTB);
				leftRight.push_back(maxLR);
			}

			int smallOne;
			for (int i = 0; i < grid.size(); ++i) {
				for (int j = 0; j < grid[i].size(); ++j) {
					if (topBottom[j] > leftRight[i])
						smallOne = leftRight[i];
					else
						smallOne = topBottom[j];
					if (grid[i][j] < smallOne)
						maxIncreaseSum += (smallOne - grid[i][j]);
				}
			}
		}
		return maxIncreaseSum;
	}
};