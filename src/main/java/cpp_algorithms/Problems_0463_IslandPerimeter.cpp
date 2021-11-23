#include <vector>
#include <iostream>

using namespace std;

// Process
//1. Input 2d grid
//2. Make extendedGrid
//3. Iterate extendedGrid (i)
// 3.1. Iterate grid[i] (j)
//  3.1.1. Check if it's 0
//   3.1.1.1. If so -> count number surrounded 1
//   3.1.1.2. Add to resultCount
//4. Return resultCount

class Solution {
public:
	int islandPerimeter(vector<vector<int>>& grid) {
		int resultCount = 0;

		vector<int> tempVec;
		for (int i = 0; i < grid[0].size(); ++i) {
			tempVec.push_back(0);
		}
		grid.insert(grid.begin(), tempVec);
		grid.insert(grid.begin(), tempVec);
		grid.insert(grid.end(), tempVec);
		grid.insert(grid.end(), tempVec);

		for (int i = 0; i < grid.size(); ++i) {
			grid[i].insert(grid[i].begin(), 0);
			grid[i].insert(grid[i].begin(), 0);
			grid[i].insert(grid[i].end(), 0);
			grid[i].insert(grid[i].end(), 0);
		}

		for (int i = 0; i < grid.size(); ++i) {
			for (int j = 0; j < grid[i].size(); ++j) {
				cout << grid[i][j] << " ";
			}
			cout << endl;
		}

		// 2.
		//vector<vector<int>> extendedGrid;
		//for (int i = 0; i < grid.size() + 4; ++i) {
		//	vector<int> tempVector;
		//	extendedGrid.push_back(tempVector);
		//	for (int j = 0; j < grid[0].size() + 4; ++j) {
		//		extendedGrid[i].push_back(0);
		//	}
		//}
		//for (int i = 2; i < grid.size() + 2; ++i) {
		//	for (int j = 2; j < grid[0].size() + 2; ++j) {
		//		extendedGrid[i][j] = grid[i - 2][j - 2];
		//	}
		//}

		// 3.
		for (int i = 1; i < grid.size() - 1; ++i) {
			int count = 0;
			for (int j = 1; j < grid[i].size() - 1; ++j) {
				if (grid[i][j] == 0) {
					if (grid[i - 1][j] == 1)
						++count;
					if (grid[i + 1][j] == 1)
						++count;
					if (grid[i][j - 1] == 1)
						++count;
					if (grid[i][j + 1] == 1)
						++count;
				}
			}
			resultCount += count;
		}

		// 4.
		return resultCount;
	}
};

//int main(int argc, char*(*argv)) {
//
//	//cout << "Hell" << endl;
//
//	//vector<int> temp1 = { 0,1,0,0 };
//	//vector<int> temp2 = { 1,1,1,0 };
//	//vector<int> temp3 = { 0,1,0,0 };
//	//vector<int> temp4 = { 1,1,0,0 };
//	vector<int> temp1 = { 0, 0, 1 };
//	vector<vector<int>> inputVec;
//	inputVec.push_back(temp1);
//	//inputVec.push_back(temp2);
//	//inputVec.push_back(temp3);
//	//inputVec.push_back(temp4);
//
//	Solution sln;
//	cout << sln.islandPerimeter(inputVec) << endl;
//}