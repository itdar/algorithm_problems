#include <vector>

using namespace std;

// Process
//1. Input rows, cols, r0, c0
//2. Iterate rows
// 2.1. Iterate cols
//  2.1.1. Calculate distance from (r0, c0)
//  2.1.2. Make coord vec
//3. Sort coord vec using calculated distance
//4. Return coordVec

class Solution {
public:
	vector<vector<int>> allCellsDistOrder(int rows, int cols, int r0, int c0) {
		vector<vector<int>> coordVec;
		vector<float> distances;

		// 2.
		for (int i = 0; i < rows; ++i)
		{
			for (int j = 0; j < cols; ++j)
			{
				vector<int> coord;
				distances.push_back(abs(i - r0) + abs(j - c0));
				coord.push_back(i);
				coord.push_back(j);
				coordVec.push_back(coord);
			}
		}

		// 3.
		int indexMin;
		float tempDistance;
		vector<int> tempCoord;

		for (int i = 0; i < distances.size() - 1; ++i) {
			indexMin = i;
			for (int j = i + 1; j < distances.size(); ++j) {
				if (distances[j] < distances[indexMin]) {
					indexMin = j;
				}
			}
			tempDistance = distances[indexMin];
			distances[indexMin] = distances[i];
			distances[i] = tempDistance;

			tempCoord = coordVec[indexMin];
			coordVec[indexMin] = coordVec[i];
			coordVec[i] = tempCoord;
		}

		return coordVec;
	}
};