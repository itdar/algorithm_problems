#include <vector>
#include <iostream>

using namespace std;

// Process
//1. Input grid
//2. Count all fresh (freshCount)
//3. Make rottenVector (coord of rottenOrange)
//4. Iterate while rottenVector size > 0
// 4.1. Iterate rottenVector from begin to the end (i)
//  4.1.1. Check up/down/left/right coord if it's fresh, if so - check rotten and put coord to rottenVector
//  4.1.2. Remove that rottenVector[i]
//  4.1.3. Count minutes
//  4.1.4. Minus freshCount
//5. Check if freshCount is 0, if not -> return -1
//6. Finish

// 처리과정
//1. 그리드 입력받는다.
//2. 전체에서 fresh 개수 세어놓는다.
//3. 최초 rottenVector (최초 rottenOrange 좌표) 만들어둔다.
//4. rottenVector size > 0 이면 반복한다.
// 4.1. rottenVector 전체 반복한다.
//  4.1.1. 상하좌우 중, 그리드 내에 있고 fresh 한 부분을 rottenVector 에 넣고 그리드에 상했다고 표시한다.
//  4.1.2. 기존 rotten 값은 vector 에서 지운다
//  4.1.3. minutes 센다
//  4.1.4. fresh 개수 뺀다.
//5. fresh 개수 0 이 아니면 -1 을 반환한다.
//6. 끝낸다.

class Solution {
public:
	int orangesRotting(vector<vector<int>>& grid) {
		int minutes = 0;
		bool isInvalid = false;
		vector<pair<int, int>> rottenVector;

		int freshCount = 0;
		// 2. / 3.
		CheckingGrid(grid, &rottenVector, &freshCount);

		cout << freshCount << endl;
		// 4.
		int m = 0;
		int n = 0;
		vector<pair<int, int>> tempRottenVector;
		bool madeRot;
		while (rottenVector.size() > 0) {
			madeRot = false;
			tempRottenVector.clear();
			for (int i = 0; i < rottenVector.size(); ++i) {
				m = rottenVector.at(i).first;
				n = rottenVector.at(i).second;

				if (m - 1 >= 0 && grid[m - 1][n] == 1) {
					grid[m - 1][n] = 2;
					tempRottenVector.push_back(make_pair(m - 1, n));
					madeRot = true;
					--freshCount;
				}
				if (n + 1 < grid[0].size() && grid[m][n + 1] == 1) {
					grid[m][n + 1] = 2;
					tempRottenVector.push_back(make_pair(m, n + 1));
					madeRot = true;
					--freshCount;
				}
				if (m + 1 < grid.size() && grid[m + 1][n] == 1) {
					grid[m + 1][n] = 2;
					tempRottenVector.push_back(make_pair(m + 1, n));
					madeRot = true;
					--freshCount;
				}
				if (n - 1 >= 0 && grid[m][n - 1] == 1) {
					grid[m][n - 1] = 2;
					tempRottenVector.push_back(make_pair(m, n - 1));
					madeRot = true;
					--freshCount;
				}
			}
			if (madeRot) {
				++minutes;
			}

			rottenVector = tempRottenVector;
		}
		if (freshCount != 0)
			return -1;

		// 5.
		return minutes;
	}
private:
	bool CheckingGrid(vector<vector<int>>& grid, vector<pair<int, int>>* rottenVector, int* freshCount) {
		bool isInvalid = false;

		for (int i = 0; !isInvalid && i < grid.size(); ++i) {
			for (int j = 0; !isInvalid && j < grid[0].size(); ++j) {
				if (grid[i][j] == 1) {
					++*freshCount;
				}
				else if (grid[i][j] == 2) {
					rottenVector->push_back(make_pair(i, j));
				}
			}
		}
		return isInvalid;
	}
};