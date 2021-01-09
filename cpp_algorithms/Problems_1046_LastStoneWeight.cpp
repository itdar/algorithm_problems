#include <vector>
#include <algorithm>

using namespace std;

// Process
//1. Input stones
//2. Sort stones (decending)
//3. Iterate till stones length becomes 0
// 3.1. Check if [0] and [1] are the same or not
//  3.1.1. If so -> remove both
//  3.1.2. If not -> subtract bigger one to smaller one, and remove smaller one
//4. Return stones[0]

class Solution {
public:
	int lastStoneWeight(vector<int>& stones) {
		if (stones.size() > 0) {
			while (stones.size() != 1) {
				sort(stones.begin(), stones.end(), greater<int>());
				if (stones[0] == stones[1]) {
					stones.erase(stones.begin());
					stones.erase(stones.begin());
				}
				else {
					stones[0] = stones[0] - stones[1];
					stones.erase(stones.begin() + 1);
				}
			}
		}
		if (stones.size() > 0)
			return stones[0];
		else
			return 0;
	}
};