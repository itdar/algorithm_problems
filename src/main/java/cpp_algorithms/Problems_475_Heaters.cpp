#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

// Process
//1. Input houses vector and heaters vector
//2. Sort both vectors
//3. Iterate heaters from begin to the end
// 3.1. Get half of the longest distance between each ordered heaters
//4. Check if it's not enough to heat all the houses
// 4.1. If not -> Get the rest distance from heat range to last house
//5. Return range

class Solution {
public:
	int findRadius(vector<int>& houses, vector<int>& heaters) {

		sort(houses.begin(), houses.end());
		sort(heaters.begin(), heaters.end());

		int longestDistance = 0;
		for (int i = 0; i < heaters.size()-1; ++i)
		{
			if (heaters[i + 1] - heaters[i] > longestDistance/2)
				longestDistance = (heaters[i + 1] - heaters[i])/2;
		}
		cout << "Longest distance : " << longestDistance << endl << endl;

		int heaterRangeStart = heaters[0] - longestDistance;
		int heaterRangeEnd = heaters[heaters.size() - 1] + longestDistance;
		int houseRangeStart = houses[0];
		int houseRangeEnd = houses[houses.size() - 1];

		// 히터범위가 집 범위 오른쪽 밖에 치우침
		if (heaterRangeStart > houseRangeEnd)
		{
			cout << 1 << endl;
			longestDistance += (heaters[0] - longestDistance - houses[0]);
		}
		// 히터범위가 집 범위 왼쪽 밖에 치우침
		else if (heaterRangeEnd < houseRangeStart)
		{
			cout << 2 << endl;
			longestDistance += (houses[houses.size() - 1] - heaters[heaters.size() - 1] + longestDistance);
		}
		// 히터범위가 집 범위 안에 있음
		else if (heaterRangeStart >= houseRangeStart && heaterRangeEnd <= houseRangeEnd)
		{
			cout << 3 << endl;
			if (heaterRangeStart - houseRangeStart > houseRangeEnd - heaterRangeEnd + longestDistance)
				longestDistance += (heaterRangeStart - houseRangeStart);
			else
				longestDistance += (houseRangeEnd - heaterRangeEnd);
		}
		// 히터범위가 집 범위 오른편에 걸쳐있음
		//
		else if (heaters[0] > houseRangeStart && heaters[0] < houseRangeEnd)
		{
			cout << 4 << endl;
			if (heaters[0] + longestDistance > heaterRangeEnd)
				longestDistance = heaters[0] - heaterRangeEnd;
			else
				longestDistance += (heaters[0] - longestDistance - houses[0]);
		}
		// 히터범위가 집 범위 왼쪽에 걸쳐있음
		else if (heaters[heaters.size() - 1] > houseRangeStart && heaters[heaters.size() - 1] < houseRangeEnd)
		{
			cout << 5 << endl;
			if (heaters[heaters.size() - 1] - longestDistance > heaterRangeStart)
				longestDistance = heaters[heaters.size() - 1] - heaterRangeEnd;
			else
				longestDistance += (houses[houses.size() - 1] - (heaters[heaters.size() - 1] + longestDistance));
		}

		return longestDistance;
	}
};

